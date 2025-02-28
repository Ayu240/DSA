public class mxmn {
    //finding maximum and minimun element size

    public static void MaxMini(int max, int min,int arr[]){
        for(int i=1;i<arr.length;i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
            if (min>arr[i]) {
                min=arr[i];
            }  
            
        }
        System.out.println();

        System.out.println("\nthe maximus element  is "+max+"\n"+"the minimun element is"+min);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,0,4,5,6,44,88,-9};
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        int max=arr[0];
        int min=arr[0];
        MaxMini(max, min, arr);
        

    }
}
    
