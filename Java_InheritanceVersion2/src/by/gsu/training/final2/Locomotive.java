package by.gsu.training.final2;

public class Locomotive {
    private String type;
    private int maximalSpeed;

    public Locomotive(String type, int maximalSpeed){
        this.type = type;
        this.maximalSpeed = maximalSpeed;
    }

    public String getType() {
        return type;
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }
}
