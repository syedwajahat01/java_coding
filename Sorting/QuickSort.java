package Sorting;

public class QuickSort {

    public static void solve(int[] arr, int start, int end){
        //base case
        if(start >= end){
            return;
        }

        int pivot = arr[end];
        int i = start - 1; //index of smaller element
        for(int j=start; j<end; j++){
            if(arr[j] <= pivot){
                i++;

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }           
        }

        i++;
        //start swap arr[i] and arr[pivot]
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        //recusive calls
        solve(arr, start, i-1);
        solve(arr, i+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {34,345,121,9,0,8,6,4,33,5,5,7,4,332};
        solve(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}