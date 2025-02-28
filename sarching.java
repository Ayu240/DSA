import java.util.*;
import java.util.Scanner;
public class sarching {
    public static int lenearseach(int[]arr,int key,int index){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        System.out.println("-1 means null or not found");
        return -1;
       
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("enter size : ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        for( int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element :");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter seach key :");
        int key=sc.nextInt();
        System.out.println(lenearseach(arr,key ,0));
       // int arr[]={1,2,3,4,5,6,7,8,9,10};
      //  System.out.println(lenearseach(arr,11,0));

    }
    
}
