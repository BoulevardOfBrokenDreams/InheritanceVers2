package by.gsu.training.final2;

public class CompartmentWagon extends Wagon {
    private int placesInCompartment;
    private String conductorsFIO;

    public CompartmentWagon(int numberOfWagon, int occupiedPlaces, int placesInCompartment, String conductorsFIO){

    }

    public int getPlacesInCompartment(){
        return placesInCompartment;
    }

    @Override
    public String typeOfComfortable() {
        return null;
    }

    @Override
    public void printConductors() {
        System.out.println(conductorsFIO);
    }
}
