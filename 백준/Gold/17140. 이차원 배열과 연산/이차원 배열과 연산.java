import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt() - 1; int c = sc.nextInt() -1; int k = sc.nextInt();

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int[][] asss = arr;
        while (true) {


            if(count > 100) {
                System.out.println(-1);
                return;
            }
            if(r < asss.length && c < asss[0].length && asss[r][c] == k)break;

            asss = simul(asss);
            count++;
        }

        System.out.println(count);
    }

    static int[][] simul(int[][] arr) {
        if(arr.length >= arr[0].length){
            int[][] rcimul = Rcimul(arr);
            return rcimul;
        }else{
            int[][] sssss = Ccimul(arr);
            return sssss;
        }
    }
    static int[][] Ccimul(int[][] arr) {

        int max = -1;
        List<List<int[]>> save = new LinkedList<>();
        for (int i = 0; i < arr[0].length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == 0) continue;
                map.put(arr[j][i], map.getOrDefault(arr[j][i], 0) + 1);
            }
            List<int[]> arnge = new LinkedList<>();

            for (int xx : map.keySet()) {
                arnge.add(new int[]{xx, map.get(xx)});
            }

            max = Math.max(max, arnge.size() * 2);
            arnge.sort(((o1, o2) -> {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }));

            save.add(arnge);

        }
        for (int j = 0; j < save.size(); j++) {
            max = Math.max(save.get(j).size(), max);
        }
        int[][] sssss = new int[max][arr[0].length];


        for (int i = 0; i < arr[0].length; i++) {
            int pos = 0;
            for (int j = 0; j < save.get(i).size() * 2; j += 2) {
                sssss[j][i] = save.get(i).get(pos)[0];
                sssss[j + 1][i] = save.get(i).get(pos)[1];
                pos++;
            }
        }
        return sssss;

    }

    static int[][] Rcimul(int[][] arr) {
        int[][] temp = new int[arr.length][];
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) continue;
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
            }
            List<int[]> arnge = new LinkedList<>();

            for (int xx : map.keySet()) {
                arnge.add(new int[]{xx, map.get(xx)});
            }

            arnge.sort(((o1, o2) -> {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }));


            max = Math.max(max, arnge.size() * 2);
            temp[i] = new int[arnge.size() * 2];
            int pos = 0;
            for (int j = 0; j < arnge.size() * 2; j += 2) {
                int[] ints = arnge.get(pos);
                temp[i][j] = ints[0];
                temp[i][j + 1] = ints[1];
                pos++;
            }
        }
        int[][] answer = new int[arr.length][max];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < max; j++) {
                if(temp.length <= i || temp[i].length <= j) continue;
                if(temp[i][j] != 0){
                    answer[i][j] = temp[i][j];
                }else answer[i][j] = 0;
            }
        }
        return answer;

    }
}
