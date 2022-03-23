import java.io.FileReader;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        double number = 0;
        int degree = 0;
        try(Scanner sc = new Scanner(new FileReader("data/in.csv"));){
            String s = sc.nextLine();
            System.out.println(s);
            String[] arr = s.split(";");
            number = Double.parseDouble(arr[0]);
            degree = Integer.parseInt(arr[1]);

        } catch (Exception message){
            System.out.println(message);
        } finally {
            System.out.println(Utils.pow(number,degree));
        }
    }
}
