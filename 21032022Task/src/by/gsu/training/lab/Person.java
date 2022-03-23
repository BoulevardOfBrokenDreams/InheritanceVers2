package by.gsu.training.lab;

public class Person {
    static {
        avgHeight = 100;
    }

    {
        height = 175;
    }

    public static final int MAX_HEIGHT = 300;
    public static int avgHeight;

    private static int sumHeight;
    private static int countAll;

    private long personID;
    private String fio;
    private int height;
    private final int YEAR_BIRTH = 2000;


    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", fio='" + fio + '\'' +
                ", height=" + height +
                ", YEAR_BIRTH=" + YEAR_BIRTH +
                '}';
    }
}
