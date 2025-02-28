import java.util.Scanner;

public class Insertion {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(":) ");
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
       // int arr[]={7,8,3,1,2};

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            //pacement
            arr[j+1]=current;
        }
        printArray(arr);
    }
    
}
