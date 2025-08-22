import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            List<Integer> players = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                players.add(sc.nextInt());
            }
            int play = sc.nextInt();

            List<int[]> list = new ArrayList<>();
            int can = get(6,0);
            for (int j = 0; j < play; j++) {
                int num = sc.nextInt(); int hour = sc.nextInt(); int time = sc.nextInt();
                if(hour == -1 && time == -1) continue;
                int i1 = get(hour, time);

                if(i1 <= can && players.contains(num)) list.add(new int[]{num,i1});
            }
            int max = Integer.MAX_VALUE;
            int find = -1;
            for(int[] li : list){
                if(li[1] < max){
                    max = li[1];
                    find = li[0];
                }
            }
            System.out.print(find + " ");
            System.out.println(list.size());
        }
    }

    static int get(int hour, int time) {
        return (hour * 60) + (time);
    }
}