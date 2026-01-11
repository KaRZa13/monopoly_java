package dao;

public class MVCMain {

    void main() {
        Joueur joueur = getJoueurFromDB();

        JoueurVue sophieVue = new JoueurVue();

        JoueurController controller = new JoueurController(joueur, sophieVue);
        controller.updateView();

        controller.setCash(controller.getCash() + 100);

        controller.updateView();
    }

    private static Joueur getJoueurFromDB() {
        return new Joueur("Sophie", 0);
    }
}