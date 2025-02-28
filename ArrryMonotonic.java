import java.util.*;

public class ArrryMonotonic {
    static boolean Monotonic(int arr[], boolean increasing, boolean decreasing){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){ 
                increasing = false;
            } else if(arr[i] > arr[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    
    
    public static void main(String[] args) {
        int arr[]={3,5,2,1};
        boolean increasing = true;
        boolean decreasing = true;
        boolean isMonotonic = Monotonic(arr, increasing, decreasing);
        System.out.println("Is the array monotonic ? " + isMonotonic);
    }
       
}
