import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        Queue<String> queue = new LinkedList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            queue.add(word);
            for(char ch : word.toCharArray()){
                if(Character.isAlphabetic(ch)){
                    cnt1++;
                }
            }
        }
        String L = sc.nextLine();
        for (char ch : L.toCharArray()) {
            if(Character.isAlphabetic(ch)) cnt2++;
        }

        while (!queue.isEmpty()) {
            Queue<String> queue1 = new LinkedList<>();
            String poll = queue.poll();
            String[] split = poll.split(" ");
            for(String ws : split) queue1.add(ws);

            for (String s : L.split(" ")) {
                if(!queue1.isEmpty() && queue1.peek().equals(s)){
                    queue1.poll();
                }
            }
            if(!queue1.isEmpty()) {
                System.out.println("Impossible");
                return;
            }

            if(cnt2 != cnt1) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");


    }

}
