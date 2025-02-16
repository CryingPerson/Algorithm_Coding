class Solution {
    public int[] solution(String[] park, String[] routes) {
      
        
        int row = park.length;
        int col = park[0].length();
        
        int x = 0;
        int y = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        for(String s : routes){
            String[] s2 = s.split(" ");
            String move = s2[0];
            int num = Integer.parseInt(s2[1]);
            boolean flag = true;
            int nx = x;
            int ny = y;
            for(int i = 1; i<=num; i++){
                if(move.equals("E")) ny++;
                else if(move.equals("W")) ny--;
                else if(move.equals("S")) nx++;
                else if(move.equals("N")) nx--;
                
                if(nx < 0 || nx >= row || ny < 0 || ny >= col || park[nx].charAt(ny) == 'X'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                x = nx;
                y = ny;
            }
            
        }
        return new int[]{x,y};
    }
}