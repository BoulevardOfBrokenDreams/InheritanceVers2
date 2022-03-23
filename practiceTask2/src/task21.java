public class task21 {
    public static void main(String[] args) {
        double number = 5;
        int degree = -3;
        double result;

        result = pow(number, degree);

        println(number, degree, result);
        printf(number, degree, result);

    }

    private static double pow(double number, int degree){
        double result = 1;
        for(int i = 0; i <Math.abs(degree); i++){
            result *= number;
        }
        return result;
    }

    private static void println(double number, int degree, double result){
        System.out.println(" число" + number + " в степени " + degree + " равно " + ((degree >= 0) ? result : 1 / result));
    }
    private static void printf(double number, int degree, double result){
        System.out.printf("число %.3f в степени %d равно %.3f", number, degree, ((degree >= 0) ? result : 1 / result));
    }
}
