//package DSA.LinkedList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class customLL {
    public static void main(String[] args){
        LinkedList<String>list=new LinkedList<String>();
        Scanner as=new Scanner(System.in);

        System.out.print("1st :");
        String a=as.nextLine();
        list.addFirst(a);

        System.out.print("2nd :");
        String b=as.nextLine();
        list.add(b);

        //print
        System.out.println(list);

        //last string
        System.out.print("2nd last: ");
        String c=as.nextLine();
        list.addLast(c);

        System.out.print("last: ");
        String d=as.nextLine();
        list.add(d);
        System.out.println(list);

        //Size of list
        System.out.println("thE size of linked list is :"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println(" null");
        //try
        for(int j=0;j<list.size();j++){
            System.out.print(j+" -> ");
        }
        System.out.println(" NULL");
       

        //deleting the string 
        try{
         System.out.print("enter the string no,what u caan delete:");
         int e=as.nextInt();
         list.remove(e);
         System.out.println(list);
        }catch(IndexOutOfBoundsException e ){
            System.out.println("this type exception-> ["+e+" ]");
        }catch(InputMismatchException e){
            System.out.println("u r enter the charter value "+e);
        }

    }
    
}
