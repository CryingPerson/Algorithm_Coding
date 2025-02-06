
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : Solution.solution(arr))
            System.out.println(x);
    }
}
class Solution{
    public static int[] solution(int[] n){
        int[] dx = {1,2,3};
        int answer = 0;
        int[] result = new int[n.length];
        for(int i = 0; i<n.length; i++){
            result[i] = DFS(0, n[i], dx);
        }
        return result;
    }
    public static int DFS(int answer,int n, int[] dx){
        int cnt = 0;
        for(int i =0; i<dx.length; i++){
            if(answer > n) return 0;
            if(answer == n){
                return 1;
            }else{
                cnt += DFS(answer + dx[i],n, dx);
            }
        }
        return cnt;
    }
}
