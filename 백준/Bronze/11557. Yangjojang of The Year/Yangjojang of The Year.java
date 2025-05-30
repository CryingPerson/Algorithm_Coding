import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();

            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                String name = sc.next();
                int have = sc.nextInt();
                map.put(name, have);
            }
            int max = -1;
            String maxName = null;
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                int have = entry.getValue();
                if(have > max){
                    max = have;
                    maxName = entry.getKey();
                }
            }
            System.out.println(maxName);
        }

    }
}
