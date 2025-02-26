class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        
        int date = 0;
            for(int i = 0; i<timelogs.length; i++){
                boolean flag = true;
                for(int j = 0; j < 7; j++){
                    date = (startday + j) % 7; 
                    if(date == 6 || date == 0) continue;
                    int time = schedules[i] / 100;
                    int minute = schedules[i] % 100;
                    int addTime = 0;
                    if(minute + 10 >= 60){
                        time++;
                        minute = minute + 10 - 60;
                        if(minute < 10){
                            String se = String.valueOf(minute);
                            se = "0" + se;
                            addTime = Integer.parseInt(String.valueOf(time) + se);
                        }
                        if((addTime) < timelogs[i][j]){
                            flag = false;
                            break;
                        } 
                        
                    }else{
                        if(schedules[i] + 10 < timelogs[i][j]){
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) answer++;
            }
        return answer;
        }
}