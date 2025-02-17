class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        String nums = "";
        for(char ch : dartResult.toCharArray()){
            if(ch >= '0' && ch <='9'){
                nums += ch;
            }else if(ch == 'S' || ch =='D' || ch =='T'){
                int n = Integer.parseInt(nums);
                if(ch == 'S'){
                    n = (int)Math.pow(n,1);
                }else if(ch == 'D'){
                    n =(int) Math.pow(n,2);
                }else{
                    n = (int)Math.pow(n,3);
                }
                
            arr[answer] = n;
            answer++;
            nums = "";
            }
            else{
                if(ch == '*'){
                    arr[answer-1] = arr[answer-1] * 2;
                    if(answer >= 2){
                        arr[answer-2] = arr[answer-2] * 2; 
                    }
                }else{
                    arr[answer-1] = arr[answer-1] * -1;
                }
            }
        }
        int sum= 0;
        for(int i = 0; i<3; i++){
            sum += arr[i];
        }
        
        return sum;
    }
}