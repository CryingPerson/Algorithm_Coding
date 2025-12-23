import java.util.*;
class Solution {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    public  int solution(int[][] points, int[][] routes) {
        int answer = 0;

        List<List<int[]>> all = new ArrayList<>();

        for (int i = 0; i < routes.length; i++) {
            int num = routes[i][0] - 1;
            int startX = points[num][0] - 1;
            int startY = points[num][1] - 1;

            List<int[]> save = new ArrayList<>();


            int count = 1;
            save.add(new int[]{startX, startY});

            for (int j = 1; j < routes[0].length; j++) {
                int num2 = routes[i][j] - 1;
                int endX = points[num2][0] - 1;
                int endY = points[num2][1] - 1;


                while (true) {
                    if(startX == endX && startY == endY){
                        break;
                    }

                    if (startX < endX) {
                        startX++;
                    } else if (startX > endX) {
                        startX--;
                    } else if (startY < endY) {
                        startY++;
                    } else startY--;

                    save.add(new int[]{startX,startY});
                    count++;

                }
                startX = endX;
                startY = endY;

            }
            all.add(save);
            max = Math.max(max, count);
        }


        int count = 0;
        for (int i = 0; i < max; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < all.size(); j++) {
                if(all.get(j).size() <= i) continue;
                int[] ss = all.get(j).get(i);

                String a = ss[0] + "," + ss[1];

                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            for (int value : map.values()) {
                if (value > 1) {
                    count++;
                }
            }
        }
        return count;
    }
}