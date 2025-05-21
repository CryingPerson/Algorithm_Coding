import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        
        Queue<Integer> q1 = new LinkedList();
        Queue<Integer> q2 = new LinkedList();
        
        long sum1 = 0;
       long sum2 = 0;
        long sum = 0;
            for(int x : queue1){
                sum1 += x;
                sum += x;
                q1.add(x);
            }
            for(int x : queue2) {
                sum2 += x;
                sum += x;
                q2.add(x);
            }
        if(sum % 2 != 0) return -1;
        long find = sum / 2;
        
            
        
        int cnt = 0;
        int len = q1.size() * 3;
        while(cnt <= len){
            if(sum1 == find) return cnt;
            if(sum2 == find) return cnt;
            
            if(sum1 > find){
                int num = q1.poll();
                sum1 -= num;
                q2.add(num);
                sum2 += num;
            }else{
                int num2 = q2.poll();
                sum2 -= num2;
                q1.add(num2);
                sum1 += num2;
            }
            cnt++;
        }
        return -1;
    }
}