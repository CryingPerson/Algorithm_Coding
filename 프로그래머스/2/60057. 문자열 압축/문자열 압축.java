class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        int sumLength = s.length();
        
        int half = sumLength/2;
        
        for(int unit = 1; unit <= half; unit++){
            String pre = s.substring(0, unit);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i = unit; i <= sumLength; i += unit){
                String str;
                if(i + unit <= sumLength){
                    str = s.substring(i, i + unit);
                }else{
                    str = s.substring(i);
                }
                if(str.equals(pre)){
                    count++;
                }else{
                    if(count > 1){
                     sb.append(count);   
                    }
                    sb.append(pre);
                    pre =str;
                    count = 1;
                }
            }
            if(count > 1){
                sb.append(count);
            } sb.append(pre);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}