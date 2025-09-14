import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        while (true) {
            int n = sc.nextInt();

            String[] names=  new String[n];
            if(n == 0) break;

            sc.nextLine();

            List<info> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] lines = sc.nextLine().split(" ");
                names[i] = lines[0];
                list.add(new info(lines[0]));
                for (int j = 0; j < n - 1; j++) {
                    list.get(i).add(lines[j + 1]);
                }
            }

            boolean ok = false;
            System.out.println("Group " + idx++);
            for (int a = 0; a < list.size(); a++) {
                for (int j = 0; j < list.get(a).list.size(); j++) {
                    if(list.get(a).list.get(j).equals("N")){
                        ok = true;
                        break;
                    }
                }
            }
            if(!ok){
                System.out.println("Nobody was nasty");
                System.out.println();
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                info info = list.get(i);
                for (int j = 0; j < info.list.size(); j++) {
                    if (info.list.get(j).equals("N")) {
                        System.out.print(names[(i + (names.length - (j + 1))) % n] + " ");
                        System.out.println("was nasty about " + info.name);
                    }
                }
            }
            System.out.println();
        }
    }
}
class info{
    String name;
    List<String> list = new ArrayList<>();

    public info(String name) {
        this.name = name;
    }

    public void add(String name) {
        list.add(name);
    }
}
