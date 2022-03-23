public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,56,732,1,55,68,234,457,56,8,68,67};
        int[] arr1 = {1,3,56,732,1,55,68,234,457,56,8,67,68};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" unsorted array");

        //arr = Task2.sort(arr);
        arr = Task22.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Sorted array");

        System.out.println("\n" + Task2.evenOdd(arr));

        System.out.println(Task2.binarySearch(arr, 0, arr.length - 1, 3));

        System.out.println(Task22.search(arr, arr));
    }
}
