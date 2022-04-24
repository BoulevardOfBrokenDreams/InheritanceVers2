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
        return ComfortTypes.Reserved.toString();
    }

    @Override
    public void printConductors() {
        System.out.printf("First conductor %s\nSecond conductor %s\n", firstConductorFIO, secondConductorFIO);
    }

    @Override
    public String getType() {
        return R_StockTypes.Reserved.toString();
    }

    @Override
    public String toString() {
        return "EconomWagon{" + super.toString() +
                ", firstConductorFIO='" + firstConductorFIO + '\'' +
                ", secondConductorFIO='" + secondConductorFIO + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
