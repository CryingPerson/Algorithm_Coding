import java.util.*;
class Solution  {
    static long min = Long.MAX_VALUE;
    public long solution(int[] diffs, int[] times, long limit) {
        int answer = 0;

        go(diffs, times, limit);
        
        return min;
    }
    static long go(int[] di, int[] ti, long li){
        long left = 1;
        long right = li;

        while(left <= right){
            long mid = (left + right) / 2;

            long ans = 0;
            for(int i = 0; i < di.length; i++){
                if(di[i] < mid){
                    ans += ti[i];
                }else{
                    if(i != 0){
                        ans += (ti[i - 1] + ti[i]) * (di[i] - mid) + ti[i];
                    }
                }
            }
            if(ans > li){
                left = mid + 1;
            }else if(ans <= li){
                min = Math.min(min, mid);
                right = mid - 1;
            }
        }
        return min;
    }
}