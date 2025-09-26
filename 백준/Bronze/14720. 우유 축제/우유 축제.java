import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (stack.isEmpty() && num == 0) {
                stack.push(num);
            }else{
                if(stack.isEmpty()) continue;
                if (stack.peek() == 0 && num == 1) {
                    stack.push(num);
                } else if (stack.peek() == 1 && num == 2) {
                    stack.push(num);
                } else if (stack.peek() == 2 && num == 0) {
                    stack.push(num);
                }
            }
        }
        System.out.println(stack.size());




    }
}