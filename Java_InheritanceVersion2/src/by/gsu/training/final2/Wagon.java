package by.gsu.training.final2;

public abstract class Wagon {
    private int numberOfWagon;
    private int countOfPlaces;
    private int occupiedPlaces;

    public int getNumberOfWagon(){
        return numberOfWagon;
    }

    public int getCountOfPassengers(){
        return occupiedPlaces;
    }

    public void changeCountOfPassengers(int newCount){
        this.countOfPlaces = newCount;
    }
}
