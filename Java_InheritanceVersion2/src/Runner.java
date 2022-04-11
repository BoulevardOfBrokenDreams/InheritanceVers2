import by.gsu.training.final2.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        CompartmentWagon obj = new CompartmentWagon(5,3,4,6,"abj");
        System.out.println(obj.getType());
        obj.print();

        EconomWagon obj1 = new EconomWagon(2000, 1, 36, "Фролова", "черт");

        obj1.print();

        Locomotive head = new Locomotive(1993, "Тепловоз", 100);

        Wagon[] rollinStock = new Wagon[3];

        rollinStock[0] = new CompartmentWagon(2010, 1, 36, 6, "Иванова");
        rollinStock[1] = new CarriageWithSeats(1999, 3, 46, ComfortTypes.СидячийЖесткий.toString());
        rollinStock[2] = new EconomWagon(2016, 13, 45, "шизова","Кулдыгбедова");

        PassangersTrain train = new PassangersTrain(215, head, rollinStock);

        System.out.println(train.getCountOfWagon());
        System.out.println(train.getNumberOfTrain());
        System.out.println(train.toString());
        train.print();
        System.out.println(train.getNotOccupiedPlaces());
        System.out.println(train.getWagonOwnNumber(5));

    }
}
