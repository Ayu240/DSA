//package DSA.SORTING;
import java.util.*;
public class Bubble {
    public static void printarr(int arr[]){
        System.out.println("Sorting means Assending Oder:");
      for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println( );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an arry : ");
        int fize=sc.nextInt();

        int arr[]=new int [fize];

        System.out.println("enter the arry list:");
        for(int i=0;i<fize;i++){
            arr[i]=sc.nextInt();
        }
       
       // int[] arr={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    } 
}
