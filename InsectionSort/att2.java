package InsectionSort;

public class att2 {
    public static void insertionS(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];;
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j -1; 
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {22, 8, 54, 31, 70, 1, 99, 13, 42, 60};
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
