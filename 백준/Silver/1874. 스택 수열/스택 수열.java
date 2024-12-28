import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        int start = 0;
        while (N-- > 0)
        {
            int push = Integer.parseInt(br.readLine());

            if(push>start) {
                for (int i = start + 1; i <= push; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }

                start = push;
            }
            else if(stack.peek() != push)
            {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}