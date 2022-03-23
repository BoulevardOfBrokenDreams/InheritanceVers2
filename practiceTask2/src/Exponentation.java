import java.util.Scanner;

class Exponentation {
    public static void main(String[] args) {
        Exponentation test = new Exponentation(3, 2);
        test.print();
        Exponentation test2 = new Exponentation(args);
        test2.print();
    }
    public Exponentation(double number, int degree) {
        this.number = number;
        this.degree = degree;
    }

    private final double number;
    private final int degree;

    public Exponentation(String[] arr){
        this(Double.parseDouble(arr[0]), Integer.parseInt(arr[1]));
    }

    public Exponentation(Scanner sc){
        this.number = sc.nextDouble();
        this.degree = sc.nextInt();
    }

    public double pow(){
        double result = 1;
        for(int i = 0; i <Math.abs(degree); i++){
            result *= number;
        }
        return result;
    }

    public void print(){
        double result = pow();
        System.out.println(number + "^(" + degree + ") = " + ((degree >= 0) ? result : 1 / result));
    }
}
