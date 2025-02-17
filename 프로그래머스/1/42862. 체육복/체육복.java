import java.util.*;
class Solution {
    static int[] ch;
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = 0;
        
        int canLis = n - lost.length;

        
        List<Integer> list1 = new ArrayList();
        for(int x : lost) list1.add(x);
        List<Integer> list2 = new ArrayList();
        for(int x : reserve){
            if(list1.contains(x)){
                list1.remove(Integer.valueOf(x));
                canLis++;
            }else{
                list2.add(x);
            }
        }
        
        for(int i = 0; i< list2.size(); i++){
            int r = list2.get(i);
            
            if(list1.contains(r -1)){
                list1.remove(Integer.valueOf(r-1));
                canLis++;
            }else if(list1.contains(r+1)){
                list1.remove(Integer.valueOf(r+1));
                canLis++;
            }
        }
        return canLis;
    }
}