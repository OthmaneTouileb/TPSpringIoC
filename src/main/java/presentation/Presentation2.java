package presentation;

import com.example.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
public class Presentation2 {
    public static void main(String[] args) {
        // Création du contexte Spring avec activation du profil "dev"
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.getEnvironment().setActiveProfiles("dev");  // Active le profil "dev"
            context.register(Presentation2.class);
            context.refresh();

            // Récupération du bean IMetier
            IMetier metier = context.getBean("metier", IMetier.class);

            // Exécution et affichage du résultat
            System.out.println("Résultat = " + metier.calcul());
        }
    }
}