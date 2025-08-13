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

        for (int num : course) {
            String[] arr = new String[num];
            for (String order : orders) {
                DFS(order, num, orders, arr, 0, 0);
                max = Integer.MIN_VALUE;
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

    static void DFS(String order, int len, String[] orders, String[] arr, int depth, int start) {
        if (depth == len) {
            int nums = check(arr, orders);
            String s = "";
            for (String ss : arr) s += ss;
            map.put(s, nums);
        } else {
            for (int i = start; i < order.length(); i++) {
                arr[depth] = String.valueOf(order.charAt(i));
                DFS(order, len, orders, arr, depth + 1,i + 1);
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