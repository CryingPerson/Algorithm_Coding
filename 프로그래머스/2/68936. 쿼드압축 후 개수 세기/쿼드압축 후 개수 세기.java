class Solution {
    static int zero = 0;
    static int one = 0;
    static boolean[][] checkd;
    public int[] solution(int[][] arr) {
        int[] answer = {};
        
        int len = arr.length;
        checkd = new boolean[len][len];
        divid(0,0,len,arr);
        return new int[]{zero,one};
    }
    static void divid(int x, int y, int size, int[][] arr){
        if(check(x,y,size,arr)){
            plus(x,y,size,arr);
            return;
        }
        size = size / 2;
        divid(x,y,size,arr);
        divid(x+size,y,size,arr);
        divid(x,y+size,size,arr);
        divid(x+size,y+size,size,arr);
    }
    static void plus(int x, int y , int size, int[][]arr){
        int num = arr[x][y];
        
        int cnt = 0;
        
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(!checkd[i][j]){
                    checkd[i][j] = true;
                    cnt++;
                }
            }
        }
        if(num == 0){
            zero ++;
        }else one ++;
    }
    static boolean check(int x, int y, int size, int[][] arr){
        int num = arr[x][y];
        
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[i][j] != num) return false;
            }
        }
        
        return true;
    }
}