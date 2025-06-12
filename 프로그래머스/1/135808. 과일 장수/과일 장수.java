import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] ss = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(ss, Collections.reverseOrder());
        // 1 1 1 2 2 3 3
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < score.length; i += m){
            int min = 9999999;
            cnt = 0;
            for(int j = i; j < i + m; j++){
                if(j >= score.length) continue;
                if(ss[j] < min) min = ss[j];
                cnt++;
            }
            if(cnt != m) continue;
            sum += min * m;
        }
        return sum;
    }
}