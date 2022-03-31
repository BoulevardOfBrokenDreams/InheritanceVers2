import java.util.Scanner;
public class Shiphr {

    public static void main(String[] args) {
        char[] form = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0'
                , '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Scanner sc = new Scanner(System.in);
        System.out.println ("Пожалуйста, введите открытый текст для шифрования:");
        String MingWen = sc.nextLine();
        MingWen = MingWen.toUpperCase (); // Использовать весь входной открытый текст с заглавной буквы
        final int K1 = 103;
        final int K2 = 103;
        final int K3 = 31;
        int [] cipherNum = new int [MingWen.length ()]; // Используется для хранения оцифрованного зашифрованного текста
        encryption(MingWen,form,K1,K2,cipherNum);
        decryption(form,MingWen,K2,K3,cipherNum);

    }
    public static void encryption(String MingWen,char[] form,int K1,int K2,int[] cipherNum){
        // Первый шаг: сохраняем открытый текст в массив
        char[] pla=new char[MingWen.length()];
        for (int i = 0; i <MingWen.length() ; i++) {
            pla[i]=MingWen.charAt(i);
        } // Открытый текст был сохранен в массиве символов pla
        // Шаг 2: Найдите число, соответствующее каждому символу в открытом тексте через нижний колонтитул, и участвуйте в операции шифрования
        int[] MingWenNumber=new int[pla.length];
        for (int i = 0; i <pla.length ; i++) {
            for (int j = 0; j <form.length ; j++) {
                if (form[j]==pla[i]) {
                    MingWenNumber[i] = j;
                }
            }
        }
        // Преобразование всего открытого текста в числа через нижний колонтитул
        char [] cipher = new char [MingWen.length ()]; // массив шифров, используемый для хранения зашифрованного текста
        for (int i = 0; i <MingWen.length() ; i++) {
            int a= Math.floorMod((K1*MingWenNumber[i]+K2),36);
            cipherNum[i]=a;
            cipher[i]=form[a];
            // Вычисляем зашифрованный текст и сохраняем его в массиве
        }
        System.out.println ("Результат шифрования:");
        System.out.println(cipher);
    }

    public static void decryption(char[] form,String Mingwen,int K2,int K3,int[] cipherNum){
        char[] JieMI=new char[Mingwen.length()];
        for (int i =0;i<Mingwen.length();i++){
            JieMI[i]=form[Math.floorMod(K3*(cipherNum[i]-K2),36)];
        }
        System.out.println ("Расшифрованный результат:");
        System.out.println(JieMI);
    }

}
