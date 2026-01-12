import dao.Player;
import dao.PlayerDao;
import dao.PlayerDaoImpl;
import iterator.Iterator;
import iterator.concrete.Board;
import iterator.models.BoardSpaces;
import terrains.*;

void main() {
    Terrain rueDeLaPaix = TerrainFactory.createProperty("property","Rue de la Paix", 400);
    Terrain rueDeCourcelles = TerrainFactory.createProperty("property","Rue de Courcelles", 100);

    rueDeLaPaix.displayInfo();
    rueDeCourcelles.displayInfo();

    Terrain gareMontparnasse = TerrainFactory.createProperty("station", "Gare Montparnasse", 200);

    gareMontparnasse.displayInfo();

    Board board = new Board();

    for (int i = 0; i <= 39; i++) {
        board.addBoardSpace(new BoardSpaces(i, "Space " + i));
    }

    Iterator<BoardSpaces> iterator = board.createIterator();

    while (iterator.hasNext()) {
        BoardSpaces space = iterator.next();
        space.displayInfo();
    }

    PlayerDao playerDao = new PlayerDaoImpl();

    System.out.println("Liste des joueurs :");
    for (Player player : playerDao.getAllPlayers()) {
        System.out.println(player);
    }

    for (Player player : playerDao.getAllPlayers()) {
        player.setCash(player.getCash() + 100);
        playerDao.updatePlayer(player);
    }

    System.out.println("\nAprès ajout de 100 balles :");
    for (Player player : playerDao.getAllPlayers()) {
        System.out.println(player);
    }

    Player playerDelete = playerDao.getAllPlayers().getFirst();
    playerDao.deletePlayer(playerDelete);

    System.out.println("\nAprès suppression :");
    for (Player j : playerDao.getAllPlayers()) {
        System.out.println(j);
    }
}