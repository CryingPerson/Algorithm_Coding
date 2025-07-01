import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int x = 0;
    static int y = 0;
    static Set<String> set = new HashSet<>();
    static String[][] ch = {{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
            {"a", "s", "d", "f", "g", "h", "j", "k", "l", " "},
            {"z", "x", "c", "v", "b", "n", "m", " ", " ", " "}};
    static char first = 'R';
    static boolean check = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        List<info> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            boolean check = false;
            int idx = -1;
            int aa = -1;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    idx = j;
                    aa = (s.charAt(j) - '0');
                    check = true;
                    break;
                }
            }
            if (check) {
                int sunwi = m - (idx + 2);
                list.add(new info(aa, sunwi));
            }
        }
        list.sort((o1, o2) -> {
            return o1.point - o2.point;
        });


        int min = Integer.MAX_VALUE;
        int[] arr = new int[11];
        int idxx = 1;
        for (info li : list) {
            if(min > li.point){
                arr[li.num] = idxx;
                min = li.point;
            }else if(min < li.point){
                arr[li.num] = idxx;
                min = li.point;
            }else{
                idxx--;
                arr[li.num] = idxx;
            }
            idxx++;
        }
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) continue;
            list1.add(arr[i]);
        }
        int[] array = list1.stream().mapToInt(i -> i).toArray();
        for (int x : array) {
            System.out.println(x);
        }
    }
}

class info {
    int num;
    int point;

    public info(int num, int point) {
        this.num = num;
        this.point = point;
    }
}

