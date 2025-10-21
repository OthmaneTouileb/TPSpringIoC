package presentation;

import com.example.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) {
        // Chargement du contexte Spring à partir du fichier XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            // Récupération du bean metier
            IMetier metier = (IMetier) context.getBean("metier");

            // Exécution et affichage du résultat
            System.out.println("Résultat (XML) = " + metier.calcul());
        } finally {
            context.close();
        }
    }
}