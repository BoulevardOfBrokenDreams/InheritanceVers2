package by.gsu.training.final2;

public abstract class Wagon {
    protected int numberOfWagon;
    protected int countOfPlaces;
    protected int occupiedPlaces;

    public int getNumberOfWagon(){
        return numberOfWagon;
    }

    public int getCountOfPassengers(){
        return occupiedPlaces;
    }

    public void changeCountOfPassengers(int newCount){
        this.countOfPlaces = newCount;
    }

    public abstract String typeOfComfortable();
    public abstract void printConductors();
}

 enum ComfortTypes{
    Купе,
    Плацкарт,
    СидячийЖесткий,
    СидячийМягкий,


}