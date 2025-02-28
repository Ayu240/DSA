//package HASHSET;
import java.util.HashSet;
import java.util.Iterator;


public class hashing {
    public static void main(String[] args) {
        //create
        HashSet<Integer>set=new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
       set.add(10);
       set.add(23);
       set.add(5);
       set.add(4);       
       System.out.println(set);

        //searching
    //     if(set.contains(1)){
    //         System.out.println("set contain 1");
    //     }if (!set.contains(6)) {
    //         System.out.print("does not contain \n");
    //     }
    //    //delete
    //    set.remove(1);
    //    if(!set.contains(1)){
    //     System.out.println("doesnt not contain 1-we are deleted:");
    //    }

       //size
       System.out.println("the size of set is :"+set.size());

       //iteraton
      Iterator it=set.iterator();
      while (it.hasNext()) {
        System.out.println(" hasnext is "+it.next());
      }
    }
}
