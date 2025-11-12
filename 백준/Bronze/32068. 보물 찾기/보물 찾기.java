import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int L = sc.nextInt(); int R = sc.nextInt(); int S = sc.nextInt();

            int curMove = S;
            int count = 1;

            int plus = 1;
            char op = '+';
            while (curMove != L && curMove != R) {
                if(op == '+'){
                    curMove += plus;
                }else curMove -= plus;
                if(op == '-'){
                    op = '+';
                }else op = '-';
                plus++;
                count++;
            }
            System.out.println(count);
        }
    }
}


