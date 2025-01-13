import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int p1 = 0;
        int p2 = 0;
        int answer = 0;
        Arrays.sort(A);
        List<Integer> list = new ArrayList();
        for(int x : B) list.add(x);
        
        list.sort(Collections.reverseOrder());
        for(int i = 0; i<B.length; i++){
            B[i] = list.get(i);
        }
        while(p1 < A.length){
            answer += A[p1] * B[p2];
            p1++;
            p2++;
        }
        return answer;
    }
}