import java.util.LinkedList;


//ll means LinkedList & its is framwork
public class Famework { 
   
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in); 6
        LinkedList<String>list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        //print
        System.out.println(list);

        list.addFirst("this");
        list.add("list");
        System.out.println(list);

        //Size of list
        System.out.println("thE size of linked list is :"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ->");
        }
        System.out.println(" null");
        list.size();

        
        //delete frist& delete last
        //list.removeFirst();
        //System.out.println( "Delete the first string :"+list);
        //list.removeLast();
        //System.out.println("delete the last String :"+list);
       
        // list.remove(3);
       // System.out.println(list);
        

       // list.reversed();
       // System.out.println("the reverse linked list is::"+list);
    }
}
