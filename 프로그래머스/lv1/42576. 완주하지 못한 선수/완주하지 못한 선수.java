import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : participant) {
            if(map.get(s) ==null){
            map.put(s, 1);}else {
                Integer temp  = map.get(s);
                map.replace(s,temp+1);
            }
        }
        for (String s : completion){
            if(map.get(s)==1) map.remove(s);
            else{
                Integer temp = map.get(s);
                map.replace(s,temp-1);
            }
        }

        for (HashMap.Entry<String,Integer> s : map.entrySet()){
            return s.getKey();
        }
        return "";
    }
}