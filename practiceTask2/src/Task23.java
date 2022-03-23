class Utils {
    public static double pow(double number, int degree){
        double result = 1;
        for(int i = 0; i <Math.abs(degree); i++){
            result *= number;
        }
        return result;
    }

    public static void println(double number, int degree, double result){
        System.out.println(" число" + number + " в степени " + degree + " равно " + ((degree >= 0) ? result : 1 / result));
    }
    public static void printf(double number, int degree, double result){
        System.out.printf("число %.3f в степени %d равно %.3f", number, degree, ((degree >= 0) ? result : 1 / result));
    }
}
public class Task23{
    public static void main(String[] args) {
        double number = 5;
        int degree = -3;
        double result;

        result = Utils.pow(number, degree);

        Utils.println(number, degree, result);
        Utils.printf(number, degree, result);

    }
}