import java.util.*;

class main{
    public static void main(String[] args){

        HashMap<String,String> map = new HashMap<>();

        // insertion
        map.put("TN","VARADHARAJA MANNAR");
        map.put("KA","DEVARATHA RAISAAR");
        map.put("AP","RAJA MANNAR");

        // Searching
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
        System.out.println(map.get("AP"));
        System.out.println(map.getOrDefault("TN","Not Found"));
        
        //Remove
        map.remove("TN");
        System.out.println(map.get("TN"));
        
        //isEmpty
        System.out.println(map.isEmpty());
        
        //size
        System.out.println(map.size());
        
        //traversal
        for(String key : map.keySet() ){
            System.out.println(key + map.get(key));
        }  
    }
}
