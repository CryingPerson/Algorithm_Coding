class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        
        for(int i = 0; i<n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            String sum = "";
            while(s1.length() < n){
                s1 = "0" + s1;
            }
            while(s2.length() < n){
                s2 = "0" + s2;
            }
            for(int j = 0; j<s1.length(); j++){
                if(s1.charAt(j) == '1' || s2.charAt(j) =='1'){
                    sum += "#";
                }else if(s1.charAt(j) == '0' && s2.charAt(j) == '0'){
                    sum += " ";
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}