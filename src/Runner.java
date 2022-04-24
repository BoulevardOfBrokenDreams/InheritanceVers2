import by.gsu.training.final2.*;

public class Runner {
    public static void main(String[] args) {
        //1 создать пассажирский поезд
        Locomotive head = new Locomotive(1993, LocomotiveTypes.Diesel.toString(), 100);

        Wagon[] rollinStock = new Wagon[4];

        //в конструкторах я не делал специально
        rollinStock[0] = new CompartmentWagon(2010, 1, 36, 6, "Иванова");
        rollinStock[0].addPassengers(30);
        rollinStock[1] = new CarriageWithSeats(1999, 3, 46, ComfortTypes.SITTING_HARD.toString());
        rollinStock[1].addPassengers(12);
        rollinStock[2] = new EconomWagon(2016, 13, 45, "шизова","Кулдыгбедова");
        rollinStock[2].addPassengers(38);
        rollinStock[3] = new CarriageWithSeats(1956, 23, 96, ComfortTypes.SITTING_SOFT.toString());
        rollinStock[3].addPassengers(95);

        PassangersTrain train = new PassangersTrain(215, head, rollinStock);

        //2 подсчитать общую численность пассажиров поезда
        int result = 0;
        for(int i = 0; i < train.getCountOfWagon(); i++){
            result += rollinStock[i].getCountOfPassengers();
        }
        System.out.println("Пассажиров в поезде " + result);

        //3 узнать общее количество свободных мест во всех вагонах заданнго типа
        result = 0;
        for(int i = 0; i < train.getCountOfWagon(); i++){
            if(train.getWagonNumber(i).getType().equals(R_StockTypes.Sitting.toString()) && train.getWagonNumber(i) != null){
                result += train.getWagonNumber(i).getCountOfPlaces() - train.getWagonNumber(i).getCountOfPassengers();
            }
        }
        System.out.println(result);

        //4 узнать количество свободных мест в вагоне с заданным номером
        int numberOfWagon = 3;
        int countOfPassangers = 0;

        Wagon necessaryWagon = train.getWagonOwnNumber(numberOfWagon);

        System.out.println(necessaryWagon.getCountOfPassengers());

        //5 посадить в поезд заданное количество пассажиров в вагоны с мягкими местами для сидения
        // если всех посадить не удалось то вывести количество оставшихся без места

        int countOfPassengers = 2;

        for(int i = 0; i < train.getCountOfWagon(); i++){

            if(train.getWagonNumber(i).typeOfComfortable().equals(ComfortTypes.SITTING_SOFT.toString())) {

                Wagon obj = train.getWagonNumber(i);
                int notOccupiedPlaces = obj.getCountOfPlaces() - obj.getCountOfPassengers();

                if (notOccupiedPlaces > 0) {
                    if (countOfPassengers < notOccupiedPlaces) {
                        obj.changeCountOfPassengers(obj.getCountOfPassengers() + countOfPassangers);
                        countOfPassengers = 0;
                        break;
                    } else {
                        obj.changeCountOfPassengers(obj.getCountOfPlaces());
                        countOfPassengers -= notOccupiedPlaces;
                    }
                }
                train.changeWagonNumber(i, obj);
            }
        }
        System.out.println((countOfPassengers > 0 ? "осталось посадить " + Integer.toString(countOfPassengers) : "всех посадили"));;

        //6 высадить по 5 пассажиров из каждого вагона
        // если количество пасажиров в вагоне меньше пяти то высадить всех

        for(int i = 0; i < train.getCountOfWagon(); i++){

            Wagon obj = train.getWagonNumber(i);

            if(obj.getCountOfPassengers() > 5){
                obj.changeCountOfPassengers(obj.getCountOfPassengers() - 5);
                train.changeWagonNumber(i, obj);
            }else{
                obj.changeCountOfPassengers(0);
                train.changeWagonNumber(i, obj);
            }
        }

        //7 Вывести в консоль информацию о вагонах с количеством пассажиров из заданного диапазона
        int firstNumber = 29;
        int secondNumber = 60;

        for (int i = 0; i < train.getCountOfWagon(); i++){
            Wagon obj = train.getWagonNumber(i);
            if(obj.getCountOfPassengers() > firstNumber && obj.getCountOfPassengers() < secondNumber){
                obj.print();
            }
        }

        //8  Узнать, сможет ли поезд проехать заданное расстояние (в километрах) за заданное время (в минутах),
        // если будет ехать с максимально возможной для локомотива скоростью.
        int distance = 3600;
        int neccesaryTime = 36;

        Locomotive obj = train.getLocomotive();
        System.out.println(obj.getMaximalSpeed() * neccesaryTime >= distance ? "Поезд проедет заданное расстояние" :
                "Поезд не проедет заданное расстояние");

        //9 Если у поезда локомотив - тепловоз, заменить его на локомотив - электровоз
        Locomotive oldHead = train.getLocomotive();
        if(oldHead.getType().equals(LocomotiveTypes.Diesel.toString())){
            train.changeLocomotive(new Locomotive(oldHead.getYEAR_OF_ISSUE(), LocomotiveTypes.Electric.toString(), oldHead.getMaximalSpeed()));
        }


        //10 отсортировать вагоны по убыванию уровня комфортности
        System.out.println(train);
        train.sortRollingStock();
        System.out.println(train);

        //11 Вывести информацию о всех проводниках поезда в консоль
        for(int i = 0; i < train.getCountOfWagon(); i++){
            train.getWagonNumber(i).printConductors();
        }

        //12 Подсчитать общее количество подвижного состава в поезде, год выпуска которого меньше заданного
        int mainYearOfIssue = 2000;
        int count = 0;

        if(train.getLocomotive().getYEAR_OF_ISSUE() < mainYearOfIssue){
            count++;
        }

        for(int i = 0; i < train.getCountOfWagon(); i++){
            if(train.getWagonNumber(i).getYEAR_OF_ISSUE() < mainYearOfIssue){
                count++;
            }
        }
        System.out.println(count);
    }



}
