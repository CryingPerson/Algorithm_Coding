class Solution {
    public static int[] dx = {-1,0 ,1 , 0};
    public static int[] dy = {0, 1, 0, -1};
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int startX = -1;
        int startY = -1;

        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    startX = i;
                    startY = j;
                }
            }
        }
        int nxx = 0;
        int nyy = 0;
        for(String s : routes){
            String[] move = s.split(" ");
            String dir = move[0];
            int count = Integer.parseInt(move[1]);
            boolean flag = true;
            if(dir.equals("E")){
                int tempX = startX;
                int tempY = startY;
                for(int i = 0; i < count; i++){
                    nxx = tempX + dx[1];
                    nyy = tempY + dy[1];
                    if(nxx < 0 || nxx >= park.length || nyy < 0 || nyy >= park[0].length()){
                        flag = false;
                        break;
                    }
                    if(nxx >= 0 && nxx < park.length && nyy >= 0 && nyy < park[0].length()
                            && park[nxx].charAt(nyy) == 'X'){
                        flag = false;
                        break;
                    }
                    tempX = nxx;
                    tempY = nyy;
                }
                if(flag){
                    startX = nxx;
                    startY = nyy;
                }
            }else if(dir.equals("W")){
                int tempX = startX;
                int tempY = startY;
                for(int i = 0; i < count; i++){
                    nxx = tempX + dx[3];
                    nyy = tempY + dy[3];
                    if(nxx < 0 || nxx >= park.length || nyy < 0 || nyy >= park[0].length()){
                        flag = false;
                        break;
                    }
                    if(nxx >= 0 && nxx < park.length && nyy >= 0 && nyy < park[0].length()
                            && park[nxx].charAt(nyy) == 'X'){
                        flag = false;
                        break;
                    }
                    tempX = nxx;
                    tempY = nyy;

                }
                if(flag){
                    startX = nxx;
                    startY = nyy;
                }
            }else if(dir.equals("N")){
                int tempX = startX;
                int tempY = startY;
                for(int i = 0; i < count; i++){
                    nxx = tempX + dx[0];
                    nyy = tempY + dy[0];
                    if(nxx < 0 || nxx >= park.length || nyy < 0 || nyy >= park[0].length()){
                        flag = false;
                        break;
                    }
                    if(nxx >= 0 && nxx < park.length && nyy >= 0 && nyy < park[0].length()
                            && park[nxx].charAt(nyy) == 'X'){
                        flag = false;
                        break;
                    }
                    tempX = nxx;
                    tempY = nyy;
                }
                if(flag){
                    startX = nxx;
                    startY = nyy;
                }
            }else{
                int tempX = startX;
                int tempY = startY;
                for(int i = 0; i < count; i++){

                    nxx = tempX + dx[2];
                    nyy = tempY + dy[2];
                    if(nxx < 0 || nxx >= park.length || nyy < 0 || nyy >= park[0].length()){
                        flag = false;
                        break;
                    }
                    if(nxx >= 0 && nxx < park.length && nyy >= 0 && nyy < park[0].length()
                            && park[nxx].charAt(nyy) == 'X'){
                        flag = false;
                        break;
                    }
                    tempX = nxx;
                    tempY = nyy;
                }
                if(flag){
                    startX = nxx;
                    startY = nyy;
                }
            }
        }
        answer[0] = startX;
        answer[1] = startY;

        return answer;
    }
}