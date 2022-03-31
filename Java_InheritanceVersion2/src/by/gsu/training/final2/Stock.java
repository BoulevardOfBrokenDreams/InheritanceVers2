package by.gsu.training.final2;

public abstract class Stock {
    private int yearOfIssue;

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public abstract String getType();
    public abstract void print();
}
