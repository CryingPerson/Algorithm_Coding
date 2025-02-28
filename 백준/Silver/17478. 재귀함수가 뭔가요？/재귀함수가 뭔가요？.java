import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] store = new int[50];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String underBar = "";
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        fibo(n,underBar);
    }

    public static void fibo(int n, String undetBar) {
        if (n == 0) {
            System.out.println(undetBar + "\"재귀함수가 뭔가요?\"");
            System.out.println(undetBar + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(undetBar + "라고 답변하였지.");
            return;
        }
        System.out.println(undetBar + "\"재귀함수가 뭔가요?\"");
        System.out.println(undetBar + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(undetBar + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(undetBar + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        fibo(n - 1, undetBar + "____");

        System.out.println(undetBar + "라고 답변하였지.");

    }
}