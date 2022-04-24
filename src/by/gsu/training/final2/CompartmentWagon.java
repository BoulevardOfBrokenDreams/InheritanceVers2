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
        return ComfortTypes.Compartment.toString();
    }

    @Override
    public void printConductors() {
        System.out.println(conductorsFIO);
    }

    @Override
    public String getType() {
        return R_StockTypes.Compartment.toString();
    }

    @Override
    public String toString() {
        return "CompartmentWagon{" + super.toString() +
                " placesInCompartment=" + placesInCompartment +
                ", conductorsFIO='" + conductorsFIO + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
