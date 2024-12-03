import java.util.*;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println("set size: "+ removeDuplicates(nums));
    }
  
    public static int removeDuplicates(int[] nums) {
          Set<Integer> tempSet=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int[] tempInt=tempSet.stream().mapToInt(Number::intValue).toArray();
        int j=0;
        for(int i: tempInt){
            nums[j]=i;
            j++;
        }
        int result=tempSet.size();        
        return result;
    }
}
