import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int a = 0; a < 60; a++) {
                    String format = String.format("%02d:%02d:%02d", i,j,a);
                    if(format.contains(String.valueOf(k))) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}