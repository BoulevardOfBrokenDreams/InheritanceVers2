package by.gsu.training.final2;

public final class CarriageWithSeats extends Wagon{
    private final String TYPES_OF_PLACES;

    public CarriageWithSeats(int yearOfIssue, int number, int countOfPlaces, String TYPES_OF_PLACES) {
        super(yearOfIssue, number, countOfPlaces);
        this.TYPES_OF_PLACES = TYPES_OF_PLACES;
    }

    public String getTypeOfPlaces(){
        return typeOfComfortable();
    }  // -получить тип мест для сидения

    @Override
    public String typeOfComfortable() {
        return TYPES_OF_PLACES;
    }

    @Override
    public void printConductors() {
        System.out.println("Кондукторов нет");
    }

    @Override
    public String getType() {
        return R_StockTypes.Сидячий.toString();
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "TYPES_OF_PLACES='" + TYPES_OF_PLACES + '\'' +
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
