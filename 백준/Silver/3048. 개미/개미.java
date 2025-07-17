import java.util.*;

public class Main {
    static int[] dx = {-1, 0 , 1 , 0};
    static int[] dy = {0 , 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();

        sc.nextLine();
        String s = sc.nextLine();
        List<ant> list = new LinkedList<>();
        for (int i = s.length() - 1; i >= 0; i--) list.add(new ant(s.charAt(i), 1, new LinkedList<>()));

        String ss = sc.nextLine();
        for (int i = 0; i < ss.length(); i++) list.add(new ant(ss.charAt(i), -1, new LinkedList<>()));


        int T =sc.nextInt();

        while (T > 0) {
            int j = 0;
            while (j < list.size() -1){
                if (list.get(j).dir != list.get(j + 1).dir) {
                    if(list.get(j).list.contains(list.get(j+1).name)){
                        j++;
                        continue;
                    }
                    if(list.get(j+1).list.contains(list.get(j).name)){
                        j++;
                        continue;
                    }

                    ant temp = list.get(j+1);
                    list.get(j+1).list.add(list.get(j).name);
                    list.get(j).list.add(list.get(j+1).name);

                    list.set(j+1, list.get(j));
                    list.set(j, temp);

                    j += 2;
                }else{
                    j++;
                }
            }


            T--;
        }
        for (ant li : list) {
            System.out.print(li.name);
        }


    }
}
class ant{
    char name;
    int dir;
    List<Character> list;
    public ant(char name, int dir, List<Character> list) {
        this.name = name;
        this.dir = dir;
        this.list = list;
    }
}
