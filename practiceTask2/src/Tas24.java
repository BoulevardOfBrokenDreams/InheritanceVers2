import java.util.Scanner;

public class Tas24 {
    public static void main(String[] args) {
        try{
            double number;
            int degree;
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите число");
            number = sc.nextDouble();
            System.out.println("Введите степень");
            degree = sc.nextInt();

            System.out.println(Utils.pow(number,degree));

        } catch (Exception message){
            System.out.println(message);
        }
    }
}
