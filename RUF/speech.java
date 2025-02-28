package RUF;
import java.util.Scanner;

public class speech {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size: ");
        int size=sc.nextInt();
        int arr []=new int [size];
        
        for(int i=0;i<size;i++){
            System.out.print("enter element: "+"\t");
            arr[i]=sc.nextInt();
        }
        
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
        
    
}
