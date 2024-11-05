package SelectionSort;

public class att2 {
    public static void selectionS(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int menorV = i;
            for(int j = i + 1; j < arr.length; j++){
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
        int[] arr = {12, 3, 18, 7, 4, 20, 5, 1, 15, 10};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        
        selectionS(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
