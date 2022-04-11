package by.gsu.training.final2;

import java.util.Arrays;

public final class PassangersTrain {
    private final int numberOfTrain;
    public Locomotive head;
    public Wagon[] rollingStock;

    public PassangersTrain(int numberOfTrain, Locomotive head, Wagon[] rollingStock) {
        this.numberOfTrain = numberOfTrain;
        this.head = head;
        this.rollingStock = rollingStock;
    }

    public int getCountOfWagon(){
        return rollingStock.length;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void changeLocomotive(Locomotive head){
        this.head = head;
    }

    public int getNotOccupiedPlaces(){

        int result = 0;
        for(int i = 0; i < getCountOfWagon(); i++){
            result += rollingStock[i].countOfPlaces - rollingStock[i].occupiedPlaces;
        }

        return result;
    }

    public Wagon getWagonOwnNumber(int number){
        for(int i = 0; i < getCountOfWagon(); i++){
            if(rollingStock[i].getNumberOfWagon() == number){
                return rollingStock[i];
            }
        }
        throw new RuntimeException("Нет вагона с таким номером");
    }

    public Wagon getWagonNumber(int number){
        if(getCountOfWagon() < number){
            return rollingStock[number];
        }
        throw new RuntimeException("Нет вагона с таким номером");
    }

    @Override
    public String toString() {
        return "PassangersTrain{" +
                "numberOfTrain=" + numberOfTrain +
                ", head=" + head +
                ", rollingStock=" + Arrays.toString(rollingStock) +
                '}';
    }

    public void print(){
        System.out.println(this);
    }


}
