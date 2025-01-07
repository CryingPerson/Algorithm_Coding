import java.util.*;

class Main {
    static int n;
    static int[]ch;
    static ArrayList<ArrayList<Integer>> list;

    public void DFS(int L) {
        for(int x : list.get(L)) {
            if(ch[x] == 0){
                ch[x] = L;
                DFS(x);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        list = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        for(int i =0; i<n-1; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        ch = new int[n+1];
        ch[1] = 1;
        T.DFS(1);

        for(int i = 2; i<=n; i++){
            System.out.println(ch[i]);
        }
    }
}