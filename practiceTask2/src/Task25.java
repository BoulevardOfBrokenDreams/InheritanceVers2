import java.io.FileReader;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        double number = 0;
        int degree = 0;
        try(Scanner sc = new Scanner(new FileReader("data/in.txt"));){
//            System.out.println("Введите число");
            number = sc.nextDouble();
//            System.out.println("Введите степень");
            degree = sc.nextInt();

        } catch (Exception message){
            System.out.println(message);
        } finally {
            System.out.println(Utils.pow(number,degree));
        }
    }
}
