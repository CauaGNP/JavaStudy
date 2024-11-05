package InsectionSort;
import java.util.Scanner;

public class att3 {
    public static void insertionS(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1]= key;
        }
    }
    public static void main(String[] args){
        int[] arr = {14, 6, 77, 38, 55, 12, 67, 4, 89, 25};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        insertionS(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
