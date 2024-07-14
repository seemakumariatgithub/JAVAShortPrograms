import java.util.Arrays;
import java.util.Collections;

class JAVA002_MostFrequentNumberInArray02 {  
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,4,59,7,8,9,9,9,9,9,9,5,5,6,7,8,7,7,7,7,7,7,7,7,7,7,7,7,7,8};
        // for(int i=0;i<arr.length-1;i++){
        // System.out.println(Collections.frequency(Arrays.asList(arr),arr[i])+","+ arr[i]);
        // }
        System.out.println(mostFrequent(arr));
    }
    
     public static int mostFrequent(Integer [] array){
        int count=0,maxCount=0,result=array[0];         
        for(int i=0;i<array.length-1;i++){
            count=Collections.frequency(Arrays.asList(array),array[i]);
            if(count>maxCount){
                maxCount=count;
                result=array[i];
            }
        }      
       return result;
    }
}
