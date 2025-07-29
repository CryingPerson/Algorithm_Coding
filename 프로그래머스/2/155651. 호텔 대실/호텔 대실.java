import java.util.*;
class Solution {
    static  List<int[]> check;
    public int solution(String[][] book_time) {
        int answer = 0;
        
        List<int[]> list = new ArrayList();
        
        for(String[] st : book_time){
            int start = get(st[0]);
            int end = get(st[1]);
            
            list.add(new int[]{start,end});
        }
        
        Collections.sort(list, (o1,o2) -> {
            return o1[0] - o2[0];
        });
         check = new ArrayList();
        check.add(list.get(0));
        answer++;
        for(int i = 1; i < list.size(); i++){
            int[] ll = list.get(i);
            if(rus(ll)){
                answer++;
                check.add(ll);
            }            
            
        }
        return answer;
    }
    static boolean rus(int[] list){
        boolean flag = true;
        for(int i = 0; i < check.size(); i++){
            int[] asd = check.get(i);
            if(asd[1] + 10 <= list[0]){
             check.set(i, list);
             return false;   
            }
            
        }
        return true;
    }
    static int get(String s){
        String[] a = s.split(":");
        int hour = Integer.parseInt(a[0]) * 60;
        int time = Integer.parseInt(a[1]);
        
        return hour + time;
        
    }
}