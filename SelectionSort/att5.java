package SelectionSort;

public class att5 {
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
        int[] arr = {56, 34, 78, 12, 65, 2, 9, 83, 47, 23};
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
