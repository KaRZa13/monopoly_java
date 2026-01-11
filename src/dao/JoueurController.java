package dao;

public class JoueurController {

    private final Joueur modele;
    private final JoueurVue vue;

    public JoueurController(Joueur modele, JoueurVue vue) {
        this.modele = modele;
        this.vue = vue;
    }

    public String getName() {
        return modele.getName();
    }

    public void setName(String name) {
        modele.setName(name);
    }

    public int getCash() {
        return modele.getCash();
    }

    public void setCash(int cash) {
        modele.setCash(cash);
    }

    public void updateView() {
        vue.afficherFicheJoueur(modele.getName(), modele.getCash());
    }
}