package Bibliotheque;

public class TestBibliotheque {

    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.ajouterLivre(new Livre("Java"));
        bibliotheque.ajouterLivre(new Livre("Jakarta EE"));
        bibliotheque.ajouterLivre(new Livre("Spring"));

        try {

            bibliotheque.emprunter("Java");

            // Deuxième tentative : le livre est déjà emprunté
            bibliotheque.emprunter("Java");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (LivreIndisponibleException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        try {

            // Livre qui n'existe pas
            bibliotheque.emprunter("Python");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (LivreIndisponibleException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        try {

            bibliotheque.retourner("Java");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}