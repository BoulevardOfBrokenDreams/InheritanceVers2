public class Methods {
    //2)      Имена методов – только с маленькой буквы
    //1 всатвка подстроки в строку с позиции
    public static String insertion(String string, String substring, int startIndex){
        String result = new String();
        for(int i = 0; i < string.length(); i++){
            if(i == startIndex){
                result += substring;
            }

            result += string.charAt(i);
        }

        return result;
    }

    //2 реверсироание строки
    public static String revers(String string){
        String result = new String();
        for(int i = string.length() - 1; i >= 0; i--){
            result += string.charAt(i);
        }
        return result;
    }

    //3 количество вхождений символа в строку
    public static int countOfChar(String string, char ch){
        int count = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }
    
    //1)      В классе для тестирования можно сделать собственный метод main()
    public static void main(String[] args) {
        System.out.println(insertion("У  получилось", "меня", 2));

        System.out.println(revers("еинаворисревер"));

        System.out.println(countOfChar("Эпистолярный грамозека)))", 'р'));
    }
}
