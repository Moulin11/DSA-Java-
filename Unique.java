import java.util.*;

class main{
    public static void main(String[] args){
       int[] arr = {1,6,2,3,3,8};
        
        int[] frequency = new int[11];
        
        for(int i = 0 ; i < arr.length ; i++){
            int value = arr[i];
            frequency[value] = frequency[value] + 1;
        }
           System.out.println("\n Unique");
        
           for(int i = 0 ; i < frequency.length ; i++){
              if(frequency[i] == 1){
                  System.out.println(" "+i);
              } 
           }
        System.out.println("\n Dupicate");
        
        for(int i =0 ; i < frequency.length ; i++){
            if(frequency[i] > 1){
                  System.out.println(" "+i);
              } 
        }
    }
}
