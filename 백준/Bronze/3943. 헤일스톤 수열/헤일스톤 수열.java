import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int max = num;
            if(num == 1) {
                System.out.println(1);
                continue;
            }
            else{
                while (num != 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    }else num = num * 3 + 1;
                    max = Math.max(max, num);
                }
            }
            System.out.println(max);
        }
    }
}