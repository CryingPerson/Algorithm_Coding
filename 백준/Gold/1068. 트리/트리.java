import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> list;
    public static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] parent = new int[n];
        ch = new int[n];
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        int root = 0; 
        for (int i = 0; i < n; i++) {
            parent[i] = sc.nextInt();
            if (parent[i] != -1) {
                list.get(parent[i]).add(i);
            } else {
                root = i; 
            }
        }

        int delete = sc.nextInt();
        ch[delete] = 1;


        int leafCount = DFS(root);
        System.out.println(leafCount);
    }

    
    public static int DFS(int node) {
        if (ch[node] == 1) {
            return 0;
        }

        if (list.get(node).isEmpty()) {
            return 1;
        }

        int sum = 0;
        for (int child : list.get(node)) {
            sum += DFS(child);
        }
        if (sum == 0) {
            return 1;
        }
        return sum;
    }
}
