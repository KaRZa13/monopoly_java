import dao.Joueur;
import dao.JoueurDao;
import dao.JoueurDaoImpl;
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



    JoueurDao joueurDao = new JoueurDaoImpl();

    System.out.println("Liste des joueurs :");
    for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
        System.out.println(joueur);
    }

    for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
        joueur.setCash(joueur.getCash() + 100);
        joueurDao.updateJoueur(joueur);
    }

    System.out.println("\nAprès ajout de 100 balles :");
    for (Joueur joueur : joueurDao.getTousLesJoueurs()) {
        System.out.println(joueur);
    }

    Joueur joueurDelete = joueurDao.getTousLesJoueurs().get(0);
    joueurDao.deleteJoueur(joueurDelete);

    System.out.println("\nAprès suppression :");
    for (Joueur j : joueurDao.getTousLesJoueurs()) {
        System.out.println(j);
    }
}