package Sorting;

public class InsertionSort {
    public static void solve(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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