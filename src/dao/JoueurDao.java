package dao;

import java.util.List;

public interface JoueurDao {

    List<Joueur> getTousLesJoueurs();

    void addJoueur(Joueur joueur);

    void updateJoueur(Joueur joueur);

    void deleteJoueur(Joueur joueur);
}
