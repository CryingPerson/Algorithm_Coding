    import javax.crypto.spec.PSource;
    import java.math.BigInteger;
    import java.util.*;

    public class Main {
        static int mmii = Integer.MAX_VALUE;
        static List<int[]> answer;
        static int min;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 만약에 1 2 3 4 5
            // 1 3 4 5
            //

            // 2 1 3 4 5
            // 2 3 1 4 5

            // 1 2 3 4 5

            // cnt++ cnt++ k++ k++ k++

            int n = sc.nextInt();

            LinkedHashMap<String, Integer> enter = new LinkedHashMap<>();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                enter.put(sc.nextLine(), i+1);
            }

            int cnt = 0;
            int k = 1;
            int k2 = 0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = enter.get(sc.nextLine());
            }
            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if(arr[i] > arr[j]){
                        cnt++;
                        break;
                    }
                }
            // 1 2 3 4 5
            // 5 3 1 2 4
                // 1 2 3
                // 2 1 3
            }
            System.out.println(cnt);
        }
    }