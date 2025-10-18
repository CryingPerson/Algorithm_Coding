import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int select = sc.nextInt();

        int[] height = new int[C];

        for (int i = 0; i < C; i++) {
            height[i] = sc.nextInt();
        }

        String[][] tetris =
                {{"0", "0000"},
                        {"00"},
                        {"001", "10"},
                        {"100", "01"},
                        {"000", "01", "101", "10"},
                        {"000", "00", "011", "20"},
                        {"000", "02", "110","00"}};

        int count = 0;

        for(String pattren : tetris[select - 1]){
            int len = pattren.length();

            for (int i = 0; i <= C - len; i++) {
                boolean ok = false;
                for (int j = 0; j < len - 1; j++) {
                    if(height[i + j] - height[i + j + 1] != pattren.charAt(j) - pattren.charAt(j + 1)){
                        ok = true;
                        break;
                    }
                }
                if(!ok) count++;
            }
        }
        System.out.println(count);
    }
}
