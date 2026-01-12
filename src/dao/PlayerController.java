package dao;

public class PlayerController {

    private final Player model;
    private final PlayerVue vue;

    public PlayerController(Player model, PlayerVue vue) {
        this.model = model;
        this.vue = vue;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public int getCash() {
        return model.getCash();
    }

    public void setCash(int cash) {
        model.setCash(cash);
    }

    public void updateView() {
        vue.afficherFicheJoueur(model.getName(), model.getCash());
    }
}