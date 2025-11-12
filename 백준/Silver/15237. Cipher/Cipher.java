import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];

        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i])){
                int[] ints = map.get(arr[i]);

                int cur = ints[0];
                int curPlus = ints[1] + 1;

                int[] push = {cur, curPlus};
                map.put(arr[i], push);
            }else{
                map.put(arr[i], new int[]{i, 1});
            }

        }

        List<int[]> list = new LinkedList<>(map.values());

        list.sort(((o1, o2) -> {
            if(o1[1]== o2[1]){
                return o1[0] - o2[0];
            }
            return o2[1] - o1[1];
        }));

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i)[0];

            for (int j = 0; j < list.get(i)[1]; j++) {
                System.out.print(arr[num] + " ");
            }
        }


    }
}

class info {
    int num;
    int idx;

    public info(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }
}

