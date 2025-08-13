import java.util.*;

class Solution {

    static int max = Integer.MIN_VALUE;
    static Map<String, Integer> map = new HashMap();

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = new String(arr);
        }

        for (String order : orders) {
            for (int len : course) {
                if (order.length() >= len) {
                    DFS(order, len, "", 0);
                }
            }
        }
        List<String> list = new ArrayList();
        for (int i = 0; i < course.length; i++) {
            int num = course[i];
            int max = -1;
            String nmae = "";
            for (String key : map.keySet()) {
                if (key.length() == num){
                    Integer i1 = map.get(key);
                    if(i1 >= 2 && max < i1){
                        max = i1;
                    }
                }
            }
            for (String key : map.keySet()) {
                if(key.length() == num){
                    Integer i1 = map.get(key);
                    if(i1 == max) list.add(key);
                }
            }
        }
        Collections.sort(list);
        

        return list.toArray(String[]::new);
    }

    static void DFS(String order, int len, String word, int start) {
        if (word.length() == len) {
           map.put(word, map.getOrDefault(word, 0) + 1);
        } else {
            for (int i = start; i < order.length(); i++) {
                DFS(order, len, word + order.charAt(i), i+1);
            }
        }
    }

    static int check(String[] arr, String[] orders) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);

        int cnt = 0;

        int length = arr.length;

        int ans = 0;
        for (int i = 0; i < orders.length; i++) {
            cnt = 0;
            for (int k = 0; k < arr.length; k++) {
                String s = arr[k];
                for (int j = 0; j < orders[i].length(); j++) {
                    if (orders[i].charAt(j) == s.charAt(0)) {
                        cnt++;
                    }
                }
            }
            if (cnt == length) {
                ans++;
            }
        }
        return ans;

    }
}