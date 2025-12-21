import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        int count = 0;
        int idx = -1;
        int sort;
        if(ext.equals("code")){
            idx = 0;
        }else if(ext.equals("date")){
            idx = 1;
        }else if(ext.equals("maximum")){
            idx = 2;
        }else idx = 3;
        
        if(sort_by.equals("code")){
            sort = 0;
        }else if(sort_by.equals("date")){
            sort = 1;
        }else if(sort_by.equals("maximum")){
            sort = 2;
        }else sort = 3;
        
        
        List<int[]> list = new ArrayList();
        for(int i = 0; i < data.length; i++){
            if(data[i][idx] < val_ext){
                list.add(new int[]{data[i][0], data[i][1], data[i][2], data[i][3]});
                count++;
            }
        }
        list.sort((o1, o2) -> {
            return o1[sort] - o2[sort];
        });
        int coun = 0;
        answer = new int[count][4];
        for(int[] ss : list){
            answer[coun][0] = ss[0];
            answer[coun][1] = ss[1];
            answer[coun][2] = ss[2];
            answer[coun][3] = ss[3];
            coun++;
        }
    
        return answer;
    }
}