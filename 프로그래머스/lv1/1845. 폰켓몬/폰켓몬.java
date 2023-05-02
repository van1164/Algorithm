import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        Integer len = nums.length;
        len = len/2;
        for (int a : nums){
            dict.put(a, a);
        }
        
        if(dict.size()>=len){
           return len; 
        }
        else {
            return dict.size();
        }
        

    }
}