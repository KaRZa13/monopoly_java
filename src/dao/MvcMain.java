package dao;

public class MvcMain {

    void main() {
        Player player = getPlayerFromDb();

        PlayerVue sophieVue = new PlayerVue();

        PlayerController controller = new PlayerController(player, sophieVue);
        controller.updateView();

        controller.setCash(controller.getCash() + 100);

        controller.updateView();
    }

    private static Player getPlayerFromDb() {
        return new Player("Sophie", 0);
    }
}