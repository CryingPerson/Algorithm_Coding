import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();

        // 01:10 01 : 50
        // 70 110
        // 01:19 01:59
        // 79 119
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String line = sc.nextLine();
            int time = getTime(line);
            list.add(time);
        }
        for (int i = 0; i < b; i++) {
            String line = sc.nextLine();
            int time = getTime(line);
            list.add(time);
        }
        Collections.sort(list);

        int next = 0;
        // 1 2 3 4 5
        int first = list.get(0);
        int total = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) + 40 >= list.get(i + 1)){
                next = list.get(i + 1);
            }else{
                if(next == 0){
                    total += 40;
                }else{
                    total += (next + 40) - first;
                }
                first = list.get(i + 1);
                next = 0;
            }
        }
        if (next != 0) {
            total += next + 40 - first;
        }else total += 40;

        System.out.println(86400 - total);
    }

    static int getTime(String line) {
        String[] split = line.split(":");

        int hour = Integer.parseInt(split[0]) * 3600;
        int time = Integer.parseInt(split[1]) * 60;
        int se = Integer.parseInt(split[2]);

        return hour + time + se;
    }
}