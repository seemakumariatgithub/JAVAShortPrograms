import java.util.Arrays;

class JAVA_MostFrequentNumberInArray {
  
    public static int mostFrequent(int[] array){
        int count=0,maxCount=0,result=array[0];        
        Arrays.sort(array);        
        for(int i=1;i<array.length;i++){
            if(array[i]==array[i-1]){
                count++;
            }
            else
            count=1;
            if(count>maxCount){
                maxCount=count;
                result=array[i-1];
            }
       }
       return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,59,7,8,9,9,9,9,9,9,5,5,6,7,8,8};
        System.out.println(mostFrequent(arr));
    }
}
