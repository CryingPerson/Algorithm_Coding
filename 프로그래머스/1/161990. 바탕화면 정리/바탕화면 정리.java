import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        List<Point> list = new ArrayList();
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                char ch = wallpaper[i].charAt(j);
                if(ch == '#')list.add(new Point(i,j));
            }
        }
        int x1 = -1;
        int y1 = -1;
        int x2 = 999;
        int y2 = 999;
        
        for(Point p : list){
            if(p.x > x1){
                x1 = p.x;
            }
            if(p.x < x2){       //최소
                x2 = p.x;
            }
            if(p.y > y1){
                y1 = p.y;
            }
            if(p.y < y2){       //최소
                y2 = p.y;
            }
        }
        answer[0] = x2;
        answer[1] = y2;
        answer[2] = x1+1;
        answer[3] = y1+1;
        // 가장 위에 있는 x 좌표를 구하기
        // 가장 왼쪽에 있는 y 좌표를 구하기
        // x = 1, y = 3
        
        // 가장 밑에 있는것으 x 좌표 
        // 가장 오른쪽에 있는 y좌표
        // x = 5 y = 8
        return answer;
    }
}
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}