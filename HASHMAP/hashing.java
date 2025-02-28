package HASHMAP;
import java.util.HashMap;
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();

        map.put("china", 150); 
        map.put("china", 150);
        map.put("us", 30);     //insertion
        map.put("india", 120);
      
        map.put("china", 110);
       // map.put("india", 110);
        //searchOpertion
        // if (map.containsKey("china")) {
        //     System.out.println("key is present in the map;");
        // }else{
        //     System.out.println("key doest no present in the map:");
        // }
        // System.out.println("the vaule is: "+map.get("china"));
        // System.out.println(map.get("indo"));
        
        //entry set
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        System.out.println();
        
        //ketset
        Set<String>keys=map.keySet();
        for(String key:keys){
        System.out.println(key+" "+map.get(key));
        }
        System.out.println();

        //remove
        map.remove("china");
        System.out.println(map);
    }    
}
