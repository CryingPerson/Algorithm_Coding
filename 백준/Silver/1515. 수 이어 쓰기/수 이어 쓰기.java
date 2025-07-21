import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();

        int n = 1;
        int idx = 0;

        while (idx < target.length()){
            String ans = String.valueOf(n);

            for (int i = 0; i < ans.length(); i++) {
                if(target.charAt(idx) == ans.charAt(i)){
                    idx++;

                    if(idx == target.length()) break;
                }
            }
            n++;
        }

        System.out.println(n - 1);
    }
}
