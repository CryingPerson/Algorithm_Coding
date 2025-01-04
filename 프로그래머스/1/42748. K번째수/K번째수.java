import java.util.*;
class Solution {
    static int index = 0;
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList();
        for(int[] com : commands){
            for(int i = com[0]; i<=com[1]; i++){
                list.add(array[i-1]);
                 Collections.sort(list);
            }
            answer[index++] = list.get(com[2]-1);
            list.clear();
        }
        return answer;
    }
}