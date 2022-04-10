package by.gsu.training.final2;

public class Locomotive extends R_Stock {
    private String type;
    private int maximalSpeed;

    public Locomotive(int yearOfIssue, String type, int maximalSpeed){
        super(yearOfIssue);
        this.type = type;
        this.maximalSpeed = maximalSpeed;
    }

    public String getType() {
        return type;
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    @Override
    public void print(){

    }
}
