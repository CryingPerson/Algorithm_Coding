import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int length = sc.nextInt(); int bell = sc.nextInt();

        int lastEmpty = (n - 1) * 5 + n * length - 1;
        int start = 0;
        int end = 0;
        int a = bell;
        List<Integer> bells = new ArrayList<>();
        for (int i = bell; i < lastEmpty + 100; i += bell) {
            bells.add(i);
        }
        for(int i = 0; i < n; i ++) {
            start = (i + 1) * length + i * 5;
            end = start + 5;

            for(int num : bells) {
                if(start <= num && end > num) {
                    System.out.println(num);
                    return;
                }
            }
        }
        for(int s : bells) {
            if(lastEmpty < s){
                System.out.println(s);
                break;
            }
        }
    }
}
