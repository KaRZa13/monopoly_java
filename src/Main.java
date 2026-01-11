import terrains.*;

void main() {
    Terrain rueDeLaPaix = TerrainFactory.createProperty("terrain","Rue de la Paix", 400);
    Terrain rueDeCourcelles = TerrainFactory.createProperty("terrain","Rue de Courcelles", 100);

    rueDeLaPaix.displayInfo();
    rueDeCourcelles.displayInfo();

    Terrain gareMontparnasse = TerrainFactory.createProperty("station","Gare Montparnasse", 200);

    gareMontparnasse.displayInfo();
}
