class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int time = 0;
        for(int i = 0; i<attacks.length; i++){
            time = Math.max(time, attacks[i][0]);
        }
        
        int curHeal = health;
        int coni = 0;
        boolean flag = true;
        for(int i = 0; i<=time; i++){
            if(i == 0) continue;
            flag = true;
            for(int[] x : attacks){
                int ti = x[0];
                int hate = x[1];
                
                if(ti == i){
                    curHeal -= hate;
                    coni = 0;
                    flag = false;
                    if(curHeal <= 0) return -1;
                    break;
                }
            }
            if(flag){
                    coni++;
                    if(coni == bandage[0]){
                        curHeal += bandage[2] + bandage[1];
                        coni = 0;
                        if(curHeal > health) curHeal = health;
                    }else{
                        curHeal += bandage[1];
                        if(curHeal > health) curHeal = health;
                    }
                   
            }
        }
        if(curHeal <= 0) return -1;
        
        return curHeal;
    }
}