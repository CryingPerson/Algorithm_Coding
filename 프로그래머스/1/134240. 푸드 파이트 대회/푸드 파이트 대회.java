class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<food.length; i++)
        {
            int a = food[i];
            
            for(int j = 0; j<a/2; j++)
            {
                sb.append(i);
            }
        }
       String answer = sb.toString()+ "0" + sb.reverse();
        return answer;
    }
}