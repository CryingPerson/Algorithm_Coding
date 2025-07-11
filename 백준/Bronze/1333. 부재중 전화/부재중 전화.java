import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int length = sc.nextInt(); 
        int bell = sc.nextInt();

        int lastEmpty = (n - 1) * 5 + n * length - 1;

        List<Integer> bells = new ArrayList<>();
        for (int i = bell; i <= lastEmpty + 100; i += bell) {
            bells.add(i);
        }

        for (int i = 0; i < n - 1; i++) {
            int start = (i + 1) * length + i * 5;
            int end = start + 5;

            for (int num : bells) {
                if (start <= num && num < end) {
                    System.out.println(num);
                    return;
                }
            }
        }

        for (int s : bells) {
            if (lastEmpty < s) {
                System.out.println(s);
                break;
            }
        }
    }
}
