package dao;

import java.util.ArrayList;

public class JoueurDaoImpl implements JoueurDao {

    private ArrayList<Joueur> joueurs = new ArrayList<>();

    public JoueurDaoImpl() {
        joueurs.add(new Joueur("Rafael", 200));
        joueurs.add(new Joueur("Papiou", 500));
        joueurs.add(new Joueur("Mokiii", 10000));
    }

    @Override
    public ArrayList<Joueur> getTousLesJoueurs() {
        return joueurs;
    }

    @Override
    public void addJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    @Override
    public void updateJoueur(Joueur joueur) {
        for (int i = 0; i < joueurs.size(); i++) {
            if (joueurs.get(i).getName().equals(joueur.getName())) {
                joueurs.set(i, joueur);
                break;
            }
        }
    }

    @Override
    public void deleteJoueur(Joueur joueur) {
        for (int i = 0; i < joueurs.size(); i++) {
            if (joueurs.get(i).getName().equals(joueur.getName())) {
                joueurs.remove(i);
                break;
            }
        }
    }
}
