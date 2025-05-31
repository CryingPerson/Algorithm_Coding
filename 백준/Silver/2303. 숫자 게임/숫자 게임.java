import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                int x = sc.nextInt();
                list.add(x);
            }
            int a = reserach(list);
            arr[i] = a;
        }
        int max = -1;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == max){
                System.out.println(i+1);
                return;
            }
        }
    }
    public static int reserach(List<Integer> list) {
        int max = -1;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                for(int k = j+1; k < 5; k++) {
                    int sum = 0;
                    sum += list.get(i) + list.get(j) + list.get(k);

                    sum = sum % 10;
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }
}
