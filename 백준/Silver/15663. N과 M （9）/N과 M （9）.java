import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n,m;
    public static ArrayList<ArrayList<Integer>> list;
    public static int[]ch;
    public static int[]ans;
    public static int[]answer;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);


        n = kb.nextInt();
        m = kb.nextInt();
        answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = kb.nextInt();
        }
        Arrays.sort(answer);
        ch = new int[n+1];
        ans = new int[m];

        back(0);
        System.out.println(sb);
    }
    public static void back(int L){
        if(L == m){
            for(int x : ans){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(ch[i] == 0 && !list1.contains(answer[i])){
                ch[i] = 1;
                list1.add(answer[i]);
                ans[L] = answer[i];
                back(L+1);
                ch[i] = 0;
            }
        }
    }
}
