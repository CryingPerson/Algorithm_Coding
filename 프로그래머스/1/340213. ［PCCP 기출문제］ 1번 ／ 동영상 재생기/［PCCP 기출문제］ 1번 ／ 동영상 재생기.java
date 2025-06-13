class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int maxTime = timeToMinutes(video_len);
        for(String s : commands){
            if(s.equals("next")){
                if(move(pos, op_start, op_end)){
                    pos = op_end;
                    pos = plus(pos, maxTime);
                }else{
                    pos = plus(pos, maxTime);
                    if(move(pos, op_start, op_end)){
                        pos = op_end;
                    }
                }
            }else{
                if(move(pos, op_start, op_end)){
                    pos = op_end;
                    pos = minus(pos);
                                        if(move(pos, op_start, op_end)){
                        pos = op_end;
                    }
                }else{
                    pos = minus(pos);
                    if(move(pos, op_start, op_end)){
                        pos = op_end;
                    }
                }
            }
            answer = pos;
        }
        return answer;
    }
    public static boolean move(String pos, String start, String end){
        String[] posArray = pos.split(":");
        int hour = Integer.parseInt(posArray[0]);
        int time = Integer.parseInt(posArray[1]);
        
        int postTime = hour * 60 + time;
        
        
        String[] startArray = start.split(":");
        int startHour = Integer.parseInt(startArray[0]);
        int startTime = Integer.parseInt(startArray[1]);
        
        int startSumTime = startHour * 60 + startTime;
        
        String[] endArray = end.split(":");
        int EndHour = Integer.parseInt(endArray[0]);
        int EndTime = Integer.parseInt(endArray[1]);
        
        int EndSumTime = EndHour * 60 + EndTime;
        
        if(startSumTime <= postTime && postTime <= EndSumTime){
            return true;
        }
        return false;
    }
    static String plus(String pos, int summ){
        String[] st = pos.split(":");
        int hour = Integer.parseInt(st[0]);
        int time = Integer.parseInt(st[1]);
        
        int sum = hour * 60 + time + 10;
        
        if(summ < sum){
            sum = summ;
        }
        hour = sum / 60;
        
        time = sum % 60;
        
         return String.format("%02d:%02d", hour, time);
    }
        static String minus(String pos){
        String anss = "";
        String[] st = pos.split(":");
        int hour = Integer.parseInt(st[0]);
        int time = Integer.parseInt(st[1]);
        
        int sum = hour * 60 + time - 10;
        

        if(sum <= 0){
            anss = "00:00";
            return anss;
        }
          
        hour = sum / 60;
        
        time = sum % 60;
        

       return String.format("%02d:%02d", hour, time);
    }
    static int timeToMinutes(String ss){
        String[] st = ss.split(":");
        int hour = Integer.parseInt(st[0]);
        int time = Integer.parseInt(st[1]);
        
        return hour * 60 + time;
    }
    
}