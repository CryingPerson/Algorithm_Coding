import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int sum = 0;
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                     sum = nums[i] + nums[j] + nums[k];
                    if(check(sum)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public static boolean check(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        
        for(int i = 2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}