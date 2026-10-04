package Connexion;

public class TestConnexion {

    public static void main(String[] args) {

        Utilisateur utilisateur =
                new Utilisateur("admin", "abc");

        String login = "admin";
        String password = "wrong";

        try {

            utilisateur.connecter(login, password);

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        try {

            utilisateur.connecter(login, password);

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        try {

            utilisateur.connecter(login, password);

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        // Quatrième tentative
        try {

            utilisateur.connecter("admin", "abc");

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}