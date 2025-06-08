import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            arr[i] = s.toCharArray();  // ✅ 반복 없이 한 줄로 처리
        }


        char []arr2 = new char[M];
        for (int i = 0; i < M; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                map.put(arr[j][i], map.getOrDefault(arr[j][i], 0) + 1);
            }
            int max = -1;
            char maxC = ' ';
            for (Map.Entry<Character, Integer> num : map.entrySet()) {
                char ch = num.getKey();
                int nums = num.getValue();
                if (nums > max) {
                    max = nums;
                    maxC = ch;
                } else if (nums == max) {
                    max = nums;
                    if(maxC < ch){
                        continue;
                    }
                    maxC = ch;
                }
            }
            arr2[i] = (char)(maxC);
        }
        int check = check(arr, arr2);
        for (char s : arr2) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(check);
    }

    static int check(char[][] arr, char[] arr2) {
        int cnty = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] != arr2[j])cnty++;
            }
        }
        return cnty;
    }
}
