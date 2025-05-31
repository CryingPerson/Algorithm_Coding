import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans = 0;
            String a = sc.next();
            String b = sc.next();

            ans += ss(a,b);
            System.out.println(ans);
        }
    }
    static int ss(String a, String b){
        int sum = 0;
        for(int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++){
            sum += check(i);
        }
        return sum;
    }
    static int check(int i){
        String value = String.valueOf(i);
        int sum = 0;
        for(char c : value.toCharArray()){
            if(c == '0') sum++;
        }
        return sum;
    }
}
