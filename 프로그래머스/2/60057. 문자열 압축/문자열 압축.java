class Solution {
    public int solution(String s) {
        int answer = s.length();
        int len = answer/2;
        for(int unit = 1; unit <= len; unit++){
            StringBuilder sb = new StringBuilder();
            String pre = s.substring(0, unit);
            
            int count = 1;
            for(int i = unit; i <= s.length(); i += unit){
                String sub;
                
                if(i + unit <= s.length()){
                    sub = s.substring(i, i+unit);
                }else{
                    sub = s.substring(i);
                }
                
                if(sub.equals(pre)){
                    count++;
                }else{
                    if(count > 1){
                        sb.append(count);
                    }
                    sb.append(pre);
                    pre = sub;
                    count = 1;
                }
            }
            if(count > 1){
                sb.append(count);
            }                sb.append(pre);

            System.out.println(sb);
            answer = Math.min(answer, sb.toString().length());

        }
            
        return answer;
    }
}