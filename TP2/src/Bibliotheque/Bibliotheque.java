package Bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void emprunter(String titre)
            throws LivreIntrouvableException, LivreIndisponibleException {

        for (Livre livre : livres) {

            if (livre.getTitre().equals(titre)) {

                if (!livre.isDisponible()) {
                    throw new LivreIndisponibleException(
                            "Le livre est déjà emprunté."
                    );
                }

                livre.setDisponible(false);
                System.out.println("Livre emprunté : " + titre);
                return;
            }
        }

        throw new LivreIntrouvableException(
                "Livre introuvable : " + titre
        );
    }

    public void retourner(String titre)
            throws LivreIntrouvableException {

        for (Livre livre : livres) {

            if (livre.getTitre().equals(titre)) {

                livre.setDisponible(true);
                System.out.println("Livre retourné : " + titre);
                return;
            }
        }

        throw new LivreIntrouvableException(
                "Livre introuvable : " + titre
        );
    }
}