import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answe = 0;
        
        Queue<Integer>[] arr = new LinkedList[board.length];
        for(int i = 0; i < board.length; i++){
            arr[i] = new LinkedList();
        }
        int size = board.length;
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(board[i][j] == 0)continue;
                arr[j].add(board[i][j]);
            }
        }
        Stack<Integer> answer = new Stack();
        
        for(int x : moves){
            if(!arr[x-1].isEmpty()){
                int num = arr[x-1].poll();
                System.out.println(num);
                if(answer.size() == 0){
                 answer.push(num);   
                }else{
                    if(answer.peek() == num){
                        answe += 2;
                        answer.pop();
                    }else answer.push(num);
                }
                
            }
        }
        
        return answe;
    }
}