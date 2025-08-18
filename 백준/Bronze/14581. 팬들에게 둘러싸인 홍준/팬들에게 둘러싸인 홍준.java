import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = ":"+s+":";
        String[] st = {":fan:",s};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == 1 && j == 1) sb.append(st[1]);
                else sb.append(st[0]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}