import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String num = sc.nextLine();
            Set<Character> set = new HashSet<>();
            
            for(char c : num.toCharArray()) set.add(c);

            System.out.println(set.size());
        }
    }

}