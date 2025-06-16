class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length; j++){
                int get = check(i, j, mats, park);
                answer = Math.max(answer, get);
            }
        }
        if(answer == 0) return - 1;
        return answer;
    }
    static int check(int x, int y, int[] arr, String[][] arr2){
        int ans = 0;
        for(int a : arr){
            boolean falg = true;
            for(int i = x; i < x + a; i++){
                for(int j = y; j < y + a; j++){
                    if(i >= arr2.length ||j >= arr2[0].length || !arr2[i][j].equals("-1")){
                        falg = false;
                        break;
                    }
                }
            }
            if(falg){
             ans = Math.max(ans, a);   
            }
        }
        return ans;
    }
}