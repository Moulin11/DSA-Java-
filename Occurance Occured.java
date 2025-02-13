import java.util.*;

class main{
    public static void main(String[] args){
        int[] array = {2,1,3,2,4,3,5,6,2};
        
        int target = 2;
        int count = 0;
        
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == target){
                count++;
            }
        }
        System.out.println("Occurance Occured is : " + count);
    }
}
