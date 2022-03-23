import java.lang.reflect.Array;
import java.util.Arrays;

public class Task22 {
    //1 сортировка
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    //2 бинарный поиск
    public static int binarySearch(int[] arr, int key){
        return Arrays.binarySearch(arr, key);
    }

    public static int search(int[] arr1, int[] arr2){

        return Arrays.compare(arr1, arr2);
    }
}
