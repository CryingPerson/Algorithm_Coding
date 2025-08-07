import java.util.*;
class Solution {
    public static int[] solution(String msg) {
        int[] answer = {};

        int idx = 1;
        Map<String, Integer> map = new TreeMap();
        for(int i = 0; i < 26; i++){
            char ch = (char)('A' + i);
            map.put(String.valueOf(ch), i+1);
        }

        StringBuilder sb = new StringBuilder();
        String s = "";
        for(int i = 0; i < msg.length(); i++){
            s = String.valueOf(msg.charAt(i));
            int plus = 0;
            for(int j = i + 1; j <= msg.length(); j++){
                while(map.containsKey(s) && j < msg.length()){
                    s += String.valueOf(msg.charAt(j++));
                    plus++;
                }
                if(map.containsKey(s)){
                    sb.append(map.get(s) + " ");
                    i += plus;
                    s = "";
                    break;
                }else{
                    map.put(s, 26 + idx++);
                    s = s.substring(0, j - i - 1);
                    sb.append(map.get(s) + " ");
                    i += plus - 1;
                    s = "";
                    break;
                }
            }
        }



        String[] s1 = sb.toString().split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        return arr;
    }
}