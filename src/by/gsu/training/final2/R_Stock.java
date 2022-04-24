package by.gsu.training.final2;

public abstract class R_Stock {
    protected final int YEAR_OF_ISSUE;

    public int getYEAR_OF_ISSUE() {
        return YEAR_OF_ISSUE;
    }

    public abstract String getType();
    public abstract void print();

    protected R_Stock(int yearOfIssue){
        this.YEAR_OF_ISSUE = yearOfIssue;
    }

    @Override
    public String toString() {
        return "YEAR_OF_ISSUE=" + YEAR_OF_ISSUE;
    }
}
