import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String a : phone_book){
            hashMap.put(a,1);
        }

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++)
                if (hashMap.containsKey(s.substring(0, j))) return false;
        }
        return true;

    }
}