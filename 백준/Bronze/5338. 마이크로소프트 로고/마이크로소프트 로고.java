import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] visited;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long min = Integer.MAX_VALUE;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("       _.-;;-._\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-;;-._|\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-''-._|");


    }

    static int get(String s) {
        String[] split = s.split(":");

        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
class info{
    String name;
    int time;

    public info(String name, int time) {
        this.name = name;
        this.time = time;
    }
}
