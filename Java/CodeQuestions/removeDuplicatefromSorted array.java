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

    ////////BETTER WAY O(1)
    class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

         int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        return i;
}
}
