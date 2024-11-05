package SelectionSort;
public class att1{
    public static void selectionSort(int[] arr){
        int arrLength = arr.length;
        
        for(int i = 0; i < arrLength; i++){
            int menorV = i;
            for(int j = i + 1; j < arrLength; j++){
                if(arr[j] < arr[menorV]){
                    menorV = j;
                }
            }
            if(menorV != i){
                int t = arr[i];
                arr[i] = arr[menorV];
                arr[menorV] = t;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {8,6,4,1,9,5};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        selectionSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}