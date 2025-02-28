package RUF;
//package LinkedLisrt;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LinkedLisrt {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        try{
          Scanner sc=new Scanner(System.in);
          System.out.print("enter size: ");
          int size=sc.nextInt();
          int arr []=new int [size];

           
          for(int i=0;i<size;i++){
                System.out.print("enter element: "+"\t");
                arr[i]=sc.nextInt();
            }
          int n = arr.length;
          divide(arr, 0, n - 1); 
          // print
          for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ->");  
            }
          System.out.print("null");
          System.out.println();
        
        
        }catch(InputMismatchException e){
            System.out.println("this type exception=>"+e);
        }catch(ArithmeticException e){
            System.out.println("u r enter arithmatic sign=>"+e);
        }catch(IndexOutOfBoundsException e ){
            System.out.println(" this tye of mistake: "+e);
        }
    }
}
