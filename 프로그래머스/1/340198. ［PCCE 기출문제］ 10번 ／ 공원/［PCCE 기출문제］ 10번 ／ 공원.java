class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        for(int x : mats){
            for(int i = 0; i<park.length; i++){
                for(int j = 0; j<park[i].length; j++){
                    if(check(i,j,x,park)){
                        answer = Math.max(x,answer);
                    }
                }
            }
        }
        return answer == 0 ? -1 : answer;
    }
    public static boolean check(int x, int y, int add, String[][]park){
        for(int i =x; i<x+add; i++){
            for(int j = y; j<y+add; j++){
                if(i >= park.length || j >= park[0].length || !park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}