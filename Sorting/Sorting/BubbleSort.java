package Sorting;

public class BubbleSort{

    public static void solve(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {62,5,3,2,5,61,1,4};
        solve(arr);

        for(int i : arr){
            System.out.print(i + " " );
        }
    }
}