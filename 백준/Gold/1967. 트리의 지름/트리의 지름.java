import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Tree>> list;
    public static int[] ch;
    public static int maxPlace = -1;
    public static int saveMaxPlace = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ch = new int[n+1];
        list = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();

            list.get(a).add(new Tree(b, v));
            list.get(b).add(new Tree(a, v));
        }
        DFS(1,0);
        ch = new int[n+1];
//        ch[9] = 1;
//        DFS(saveMaxPlace, 0);
        ch[saveMaxPlace] = 1;

        maxPlace = 0;
        DFS(saveMaxPlace,0);
        System.out.println(maxPlace);
    }
    public static void DFS(int n, int sum) {
        if(maxPlace < sum) {
            maxPlace = sum;
            saveMaxPlace = n;
        }
        ch[n] = 1;
        for(Tree x : list.get(n)){

            if(ch[x.point] == 0){
                ch[x.point] = 1;
                DFS(x.point, sum + x.value);
            }
        }
    }
}
class Tree{
    int point;
    int value;
    public Tree(int point, int value){
        this.point = point;
        this.value = value;
    }
}
