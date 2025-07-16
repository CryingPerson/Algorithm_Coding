import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        int cnt = 0;
        
        for(int x : arr) if(x == n) cnt++;

        System.out.println(cnt);
    }

}
