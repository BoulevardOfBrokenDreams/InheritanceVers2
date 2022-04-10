package by.gsu.training.final2;

public abstract class R_Stock {
    private int yearOfIssue;

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public abstract String getType();
    public abstract void print();

    protected R_Stock(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }
}
