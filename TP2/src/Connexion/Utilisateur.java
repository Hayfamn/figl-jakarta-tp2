package Connexion;

public class Utilisateur {

    private String login;
    private String password;

    private int tentatives;
    private boolean bloque;

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
        this.tentatives = 0;
        this.bloque = false;
    }

    public void connecter(String login, String password)
            throws IdentifiantsInvalidesException, CompteBloqueException {

        // Vérifier si le compte est déjà bloqué
        if (bloque) {
            throw new CompteBloqueException("Compte bloqué.");
        }

        // Vérifier les identifiants
        if (!this.login.equals(login) || !this.password.equals(password)) {

            tentatives++;

            if (tentatives >= 3) {
                bloque = true;
                throw new CompteBloqueException("Compte bloqué.");
            }

            throw new IdentifiantsInvalidesException(
                    "Identifiants incorrects. Tentative "
                    + tentatives + "/3"
            );
        }

        System.out.println("Connexion réussie !");
        tentatives = 0;
    }
}