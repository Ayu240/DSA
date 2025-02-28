
//Find the minimum element in an array  that    
import java.util.ArrayList;
/**
 * array001
 */
public class array001 {
    static void maximum( int max,int arr[]){
        max=arr[0]; 
        for(int i=1;i<arr.length;i++){ 
            max=Math.max(max,arr[i]); 
        }

        int maxIndex=0;

        for (int i = 1; i < arr.length; i++) {
            if (max<=arr[i]) {
                max = arr[i];
                maxIndex = i; // Update minIndex whenever a smaller element is found
            }
           
        }
        System.out.println("Maximum vale is "+max);
        System.out.println("the index of maximum is "+maxIndex);

    }

    
    static void minimum(int mini,int arr[]){
        mini=arr[0];
        for(int i=1;i<arr.length;i++){ 
            mini=Math.min(mini,arr[i]); 
        }
       
        int minIndex = 0; // Initialize minIndex to 0

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= mini) {
                mini = arr[i];
                minIndex = i; // Update minIndex whenever a smaller element is found
            }
        }
    
        System.out.println("Minimum value: " + mini);
        System.out.println("Index of minimum value: " + minIndex);

    }

    public static void main(String[]args){ 

        int[]arr={2,9,1,-5,6,-5,1,9}; 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
      //  int n=arr.length; 
        minimum(0,arr);
        System.out.println();
        maximum(0,arr);
      
    } 
    
}