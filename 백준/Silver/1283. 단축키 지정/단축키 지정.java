import java.math.BigInteger;
import java.util.*;

class Main {
    static Set<String> set = new HashSet<>();
    static List<int[]> list = new ArrayList<>();
    static int idx = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arr[i] = s;
             s = s.toLowerCase();
            check(s);
            idx++;
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int[] pos = list.get(i);
            if (pos[0] == -1) {
                System.out.println(arr[i]);
            } else {
                String s = arr[i];
                int p = pos[1];
                System.out.println(s.substring(0, p) + "[" + s.charAt(p) + "]" + s.substring(p + 1));
            }
        }
            idx++;
    }

    static void check(String s) {
        if (firstAlpabets(s)) {

        } else if(secondAlpabets(s)){
        }else{
            list.add(new int[]{-1,-1});
        }
    }

    static boolean firstAlpabets(String s) {
        String[] split = s.split(" ");
        boolean flag = false;
        int currentPos = 0;

        for (int i = 0; i < split.length; i++) {
            char c = split[i].charAt(0);
            if (!set.contains(String.valueOf(c))) {
                set.add(String.valueOf(c));
                list.add(new int[]{idx, currentPos});
                flag = true;
                break;
            }
            currentPos += split[i].length() + 1; 
        }
        return flag;
    }

    static boolean secondAlpabets(String s) {
        String[] split = s.split(" ");
        boolean flag = false;
        int currentPos = 0;

        for (int i = 0; i < split.length; i++) {
            for (int j = 1; j < split[i].length(); j++) {
                char c = split[i].charAt(j);
                if (!set.contains(String.valueOf(c))) {
                    set.add(String.valueOf(c));
                    list.add(new int[]{idx, currentPos + j});
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            currentPos += split[i].length() + 1;
        }
        return flag;
    }

}
