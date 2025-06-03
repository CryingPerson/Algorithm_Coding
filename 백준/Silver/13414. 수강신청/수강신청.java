import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int totalApply = sc.nextInt();

        sc.nextLine();
        String s = String.valueOf(totalApply);
        Map<String, Integer> queue = new HashMap<>();
        for (int i = 0; i < totalApply; i++) {
            String number = sc.nextLine();

            if(queue.containsKey(number)){
                queue.remove(number);
            }
            queue.put(number, i);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(queue.entrySet());
        entries.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (int i = 0; i < Math.min(max, entries.size()); i++) {
            System.out.println(entries.get(i).getKey());
        }
    }
}
