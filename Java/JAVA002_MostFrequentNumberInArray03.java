import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class JAVA002_MostFrequentNumberInArray03 {  
    public static void main(String[] args) {
        List<Integer> myList=Arrays.asList(1,2,3,4,8,8,8,8,8,8,5,9,7,8,9,9,9,9,9,9);
        System.out.println(mostFrequent(myList));
    }    

     public static Object mostFrequent(List array){
        int count=0,maxCount=0;
        Object result=array.get(0);            
        for(int i=0;i<array.size()-1;i++){
            count=Collections.frequency(array,array.get(i));
            if(count>maxCount){
                maxCount=count;
                result=array.get(i);
            }
        }      
       return result;
    }
}
