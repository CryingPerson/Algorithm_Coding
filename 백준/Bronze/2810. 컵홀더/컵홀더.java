import java.util.Scanner;

public class Main {
    public static int x;
    static int y;
    static int dollx;
    static int dolly;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String s = sc.next();
        String replace = s.replaceAll("LL", "S");

        int cnt = 0;
        for(char ch : replace.toCharArray()) {
            cnt++;
        }
        if(cnt == N){
            System.out.println(cnt);
        }else{
            System.out.println(cnt+1);
        }
    }
}
