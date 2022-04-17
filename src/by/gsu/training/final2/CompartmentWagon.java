package by.gsu.training.final2;

public final class CompartmentWagon extends Wagon {
    private final int placesInCompartment;
    private final String conductorsFIO;

    public CompartmentWagon(int yearOfIssue, int numberOfWagon,int countOfPlaces, int placesInCompartment, String conductorsFIO){
        super(yearOfIssue, numberOfWagon, countOfPlaces);
        this.placesInCompartment = placesInCompartment;
        this.conductorsFIO = conductorsFIO;
    }

    public int getPlacesInCompartment(){
        return placesInCompartment;
    }

    @Override
    public String typeOfComfortable() {
        return ComfortTypes.Купе.toString();
    }

    @Override
    public void printConductors() {
        System.out.println(conductorsFIO);
    }

    @Override
    public String getType() {
        return R_StockTypes.Купейный.toString();
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "placesInCompartment=" + placesInCompartment +
                ", conductorsFIO='" + conductorsFIO + '\'' +
                ", YEAR_OF_ISSUE=" + YEAR_OF_ISSUE +
                ", numberOfWagon=" + numberOfWagon +
                ", countOfPlaces=" + countOfPlaces +
                ", occupiedPlaces=" + occupiedPlaces +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
