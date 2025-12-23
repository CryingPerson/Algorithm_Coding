import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            List<int[]> list = new ArrayList<>();
            for (int j = 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if(j + k == num) {
                        list.add(new int[]{j, k});
                    }else{

                    }
                }
            }
            System.out.print("Pairs for ");
            System.out.print(num + ":");

            if(list.isEmpty()){
                System.out.println();
                continue;
            }

            if(list.size() == 1){
                System.out.println(" " + list.get(0)[0] + " " + list.get(0)[1]);
            }else{
                for (int a = 0; a < list.size() - 1; a++) {
                    System.out.print(" " + list.get(a)[0] + " " + list.get(a)[1] + ",");
                }
                System.out.println(" " + list.get(list.size() - 1)[0] + " " + list.get(list.size() - 1)[1]);
            }
        }
    }
}