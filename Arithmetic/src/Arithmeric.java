public class Arithmeric {
    public static void main(String[] args) {
        System.out.println(method(args));
    }

    private static String method(String[] args){
        try{
            int firstArg = Integer.parseInt(args[0]);
            int secondArg = Integer.parseInt(args[1]);

            switch (args[2].charAt(0)) {
                case '+':
                    return firstArg + " + " + secondArg + " = " + (firstArg + secondArg);
                case '-':
                    return firstArg + " - " + secondArg + " = " + (firstArg - secondArg);
                case '/':
                    return firstArg + " / " + secondArg + " = " + (firstArg / secondArg);
                case '*':
                    return firstArg + " * " + secondArg + " = " + (firstArg * secondArg);
                default:
                    throw new RuntimeException("there is no such operation");
            }
        } catch (Exception exception){
            return exception.toString();
        }
    }
}
