import java.util.*;

public class Swaping {
    public static void swap(int a, int arr[],int b){
        
       int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int left = 0, right = n - 1;
    
        while (left <= right) {
            swap(left, arr, right);
            left++;
            right--;
           
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            swap(i, arr, n - 1 - i);
        }    
    

    }
}
