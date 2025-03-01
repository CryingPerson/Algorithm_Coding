import java.util.*;

public class Main {
    static int[] arr;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Number s = 1;
        int C = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            map.put(num, map.getOrDefault(num, 0) + 1);
            indexMap.putIfAbsent(num, i);
            list.add(num);
        }

        list.sort((o1, o2) -> {
            int A = map.get(o1);
            int B = map.get(o2);

            if(A == B){
                return indexMap.get(o1) - indexMap.get(o2);
            }
            return B - A;
        });

        for (int x : list){
            if(x > C) continue;
            System.out.print(x + " ");
        }
    }
}

