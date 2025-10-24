import java.util.*;

public class Main {
    static List<int[]> cctv = new ArrayList<>();
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static int[][][] point = {{{0}, {1}, {2}, {3}}, {{0, 2}, {1, 3}}, {{0, 1}, {1, 2}, {2, 3}, {3, 0}},
            {{0, 1, 2}, {1, 2, 3},{2,3,0}, {3, 0, 1}}, {{0, 1, 2, 3}}};

    static int min = Integer.MAX_VALUE;

    static int x,y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while (true) {
            String word = sc.nextLine();

            if(!word.equals("고무오리 디버깅 시작")){
                list.add(word);
            }
            if(word.equals("고무오리 디버깅 끝")) break;
        }


        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);

            if (name.equals("고무오리") && queue.isEmpty()) {
                for(int j = 0; j < 2; j++) queue.add("문제");
            } else if (name.equals("고무오리") && !queue.isEmpty()) {
                queue.poll();
            } else if(name.equals("문제")){
                queue.add("문제");
            }
        }

        if (queue.isEmpty()) {
            System.out.println("고무오리야 사랑해");
        }else System.out.println("힝구");
    }
}

