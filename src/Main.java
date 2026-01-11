import iterator.Iterator;
import iterator.concrete.Board;
import iterator.models.BoardSpaces;
import terrains.*;

void main() {
    Terrain rueDeLaPaix = TerrainFactory.createProperty("property","Rue de la Paix", 400);
    Terrain rueDeCourcelles = TerrainFactory.createProperty("property","Rue de Courcelles", 100);

    rueDeLaPaix.displayInfo();
    rueDeCourcelles.displayInfo();

    Terrain gareMontparnasse = TerrainFactory.createProperty("station","Gare Montparnasse", 200);

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
}
