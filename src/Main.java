import Properties.*;

void main() {
    Property rueDeLaPaix = PropertyFactory.createProperty("terrain","Rue de la Paix", 400);
    Property rueDeCourcelles = PropertyFactory.createProperty("terrain","Rue de Courcelles", 100);

    rueDeLaPaix.displayInfo();
    rueDeCourcelles.displayInfo();

    Property gareMontparnasse = PropertyFactory.createProperty("station","Gare Montparnasse", 200);

    gareMontparnasse.displayInfo();
}
