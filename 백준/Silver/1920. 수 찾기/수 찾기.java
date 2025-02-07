import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
/*
public class back1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());

        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(str.nextToken());
            map.put(num, 0);
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer str1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int findby = Integer.parseInt(str1.nextToken());
            if (map.containsKey(findby)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(str.nextToken());
            arr[i] = num;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer str1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int findById = Integer.parseInt(str1.nextToken());
            sb.append(binary(findById,arr)).append("\n");
        }
        System.out.println(sb);
    }

    public static int binary(int key, int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            }else {
                return 1;
            }
        }
        return 0;
    }
}

