package by.gsu.training.final2;

public abstract class Wagon extends R_Stock {

    protected final int numberOfWagon;
    protected int countOfPlaces;
    protected int occupiedPlaces;

    public Wagon( int yearOfIssue, int numberOfWagon, int countOfPlaces){
        super(yearOfIssue);
        this.numberOfWagon = numberOfWagon;
        this.countOfPlaces = countOfPlaces;
    }

    public int getNumberOfWagon(){
        return numberOfWagon;
    }

    public int getCountOfPlaces() { return countOfPlaces; }

    public int getCountOfPassengers(){
        return occupiedPlaces;
    }

    public void changeCountOfPassengers(int newCount){
        this.countOfPlaces = newCount;
    }

    public void addPassengers(int count){
        if(occupiedPlaces + count < countOfPlaces){
            occupiedPlaces += count;
        }else{
            throw new RuntimeException("Столько не поместится");
        }
    }

    public abstract String typeOfComfortable();
    public abstract void printConductors();

    @Override
    public String toString() {
        return "Wagon{" + super.toString() +
                " numberOfWagon=" + numberOfWagon +
                ", countOfPlaces=" + countOfPlaces +
                ", occupiedPlaces=" + occupiedPlaces +
                '}';
    }
}