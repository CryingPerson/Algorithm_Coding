import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String ,Integer> map = new HashMap<>();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] lines = sc.nextLine().split(" ");
            map.put(lines[0], map.getOrDefault(lines[0], 0) + Integer.parseInt(lines[1]));
        }
        for(int maps : map.values()){
            if(maps == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}