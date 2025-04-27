import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int start = start(n);
            System.out.println(start);
        }
    }

    public static int start(int num) {
        String val = String.valueOf(num);
        int len = val.length();
        int add = len - 1 + 2;

        int sum = 0;
        for (char ch : val.toCharArray()) {
            if(ch == '0'){
                sum += 4;
            }else if(ch == '1'){
                sum += 2;
            }else {
                sum += 3;
            }
        }
        return sum + add;
    }
}
