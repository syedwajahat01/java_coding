package Sorting;

public class SelectionSort{

    public static void solve(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {34,345,121,9,0,8,6,4,33,5,5,7,4,332};
        solve(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}