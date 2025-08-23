package Sorting;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid + 1;

        int[] temp = new int[end - start + 1];

        int tempIndex = 0;
        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[tempIndex++] = arr[left];
                left++;
            }
            else{
                temp[tempIndex++] = arr[right];
                right++;
            }
        }

        while(left <= mid){
            temp[tempIndex++] = arr[left];
            left++;
        }

        while(right <= end){
            temp[tempIndex++] = arr[right];
            right++;
        }

        for(int i=0; i<temp.length; i++){
            arr[start + i] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        //base case
        if(start == end){
            return;
        }

        int mid = start + (end - start)/2;
        //recusive calls
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        //merge two sorted halves
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {34,345,121,9,0,8,6,4,33,5,5,7,4,332};
        //solve(arr);
        mergeSort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
