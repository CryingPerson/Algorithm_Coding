import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); int B = sc.nextInt(); int G = sc.nextInt();

        Map<List<String>, Integer> map = new HashMap<>();

        sc.nextLine();
        List<String> list = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < A; i++) {

            list.add(sc.next());
        }


        for (int i = 0; i < B; i++) {

            list2.add(sc.next());
        }

        for (int i = 0; i < G; i++) {
            String name = sc.next();

            if(list.contains(name)){
                map.put(list, map.getOrDefault(list, 0) + 1);
            }else{
                map.put(list2, map.getOrDefault(list2, 0) + 1);
            }
        }

        if (map.getOrDefault(list, 0) > map.getOrDefault(list2, 0)) {
            System.out.println("A");
        }else if(map.getOrDefault(list, 0) < map.getOrDefault(list2, 0)){
            System.out.println("B");
        }else{
            System.out.println("TIE");
        }
    }
}


