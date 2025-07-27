import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diffecence = 0;
        int answer = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[4];
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            min = Math.min(Math.abs(list.get(i) - list.get(i+1)), min);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if(!list.contains(list.get(i) + min)){
                System.out.println(list.get(i) + min);
                return;
            }
        }

    }
}
