class Solution {
    public int[] solution(int n, long left, long right) {
                int size = (int)(right - left + 1);
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++){
            long index = left + i;
            int row = (int)(index / n);
            int colw = (int)(index % n);
            
            answer[i] = Math.max(row, colw) + 1;
        }
        
        
        
        
        
        return answer;
    }
}