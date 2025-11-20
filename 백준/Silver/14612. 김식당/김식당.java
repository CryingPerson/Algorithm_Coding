import java.util.*;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        List<int[]> list=  new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            if(cmd.equals("order")){
                int tableNum = sc.nextInt();
                int orderTime = sc.nextInt();

                list.add(new int[]{tableNum, orderTime});
                for (int[] xx : list) {
                    System.out.print(xx[0] + " ");
                }
                System.out.println();
            }else if(cmd.equals("complete")){
                int CompleNum = sc.nextInt();

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j)[0] == CompleNum) {
                        list.remove(j);
                        break;
                    }
                }
                if(list.size() == 0){
                    System.out.println("sleep");
                    continue;
                }
                for (int[] xx : list) {
                    System.out.print(xx[0] + " ");
                }
                System.out.println();
            }else{
                list.sort(((o1, o2) -> {
                    if(o1[1] == o2[1]){
                        return o1[0] - o2[0];
                    }
                    return o1[1] - o2[1];
                }));
                if(list.size() == 0){
                    System.out.println("sleep");
                    continue;
                }
                for (int[] xx : list) {
                    System.out.print(xx[0] + " ");
                }
                System.out.println();
            }
        }

    }
}
