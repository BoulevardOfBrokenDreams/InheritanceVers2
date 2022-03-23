import java.util.Scanner;

public class zxc {

    // Метод удаления всех вхождений подстроки в строку
    public static String SubDel(String string, char subch){
        String res = new String();
        for (int i = 0 ; i < string.length(); i++) {
            if (string.charAt(i) != subch){
                res += string.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = "zxczxczxczxc";
        char z = 'c';
        System.out.println(SubDel(a, z));
    }
}
