import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        String sdd = "SDSD";
        List<String>[] lists = new List[8];

        String[] st = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        for (int i = 0; i < 8; i++) {
            lists[i] = new ArrayList<>();
            for (char ch : st[i].toCharArray()) {
                lists[i].add(String.valueOf(ch));
            }
        }

        char pre = ' ';
        int cnt = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                cnt += p;
                pre = c;
                continue;
            }
            for (int i = 0; i < 8; i++) {
                if (lists[i].contains(String.valueOf(c))) {
                    if (lists[i].contains(String.valueOf(pre))) {
                        cnt += w;
                    }
                    int i1 = lists[i].indexOf(String.valueOf(c));
                    cnt += (i1 + 1) * p;
                    break;
                }
            }
            count = 0;
            pre = c;
        }
        System.out.println(cnt);
    }
}
