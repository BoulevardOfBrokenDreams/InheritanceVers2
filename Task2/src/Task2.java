public class Task2 {
    //1 сортировка массива
    public static int[] sort(int [] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        return arr;
    }

    //2 подсчет количества нечетных и четных
    public static String evenOdd(int[] arr){
        int countOfEven = 0;
        int countOfOdd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countOfEven++;
            } else{
                countOfOdd++;
            }
        }
        return "Count of even = " + countOfEven + "\nCount of odd = " + countOfOdd;
    }

    //3 бинарный поиск (рекурсивный)
     public static int binarySearch(int intArray[], int low, int high, int key){
        if (high>=low){

            int mid = low + (high - low)/2;

            if (intArray[mid] == key){
                return mid;
            }

            if (intArray[mid] > key){
                return binarySearch(intArray, low, mid-1, key);
            }else {
                return binarySearch(intArray, mid+1, high, key);
            }
        }
        return -1;
    }
}


