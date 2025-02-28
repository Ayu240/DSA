
import java.util.*;
public class Selection {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={7,8,3,1,2,};
      
        for(int i=0;i<arr.length;i++){
            int samllest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[samllest]>arr[j]){
                    samllest=j;
                }
            }
            int temp=arr[samllest];
            arr[samllest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);

    }
    
}
