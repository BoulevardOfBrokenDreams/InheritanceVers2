package by.gsu.training.final2;

public final class Locomotive extends R_Stock {
    private String type;
    private int maximalSpeed;

    public Locomotive(int yearOfIssue, String type, int maximalSpeed){
        super(yearOfIssue);
        this.type = type;
        this.maximalSpeed = maximalSpeed;
    }

    public String getType(){
        return type;
    }

    public int getMaximalSpeed(){
        return maximalSpeed;
    }

    @Override
    public String toString() {
        return "Locomotive{" + super.toString() +
                " type='" + type + '\'' +
                ", maximalSpeed=" + maximalSpeed +
                "}";
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
