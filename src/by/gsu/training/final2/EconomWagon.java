package by.gsu.training.final2;

public final class EconomWagon extends Wagon {
    private String firstConductorFIO;
    private String secondConductorFIO;


    public EconomWagon(int YearOfIssue, int number, int countplaces, String firstConductorFIO, String secondConductorFIO){
        super(YearOfIssue,  number, countplaces);
        this.firstConductorFIO = firstConductorFIO;
        this.secondConductorFIO = secondConductorFIO;
    }

    @Override
    public String typeOfComfortable() {
        return ComfortTypes.Плацкарт.toString();
    }

    @Override
    public void printConductors() {
        System.out.printf("First conductor %s\nSecond conductor %s\n", firstConductorFIO, secondConductorFIO);
    }

    @Override
    public String getType() {
        return R_StockTypes.Плацкарт.toString();
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "firstConductorFIO='" + firstConductorFIO + '\'' +
                ", secondConductorFIO='" + secondConductorFIO + '\'' +
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
