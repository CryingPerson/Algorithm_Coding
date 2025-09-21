import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int answer = 0;

        for(char c : n.toCharArray()){
            answer += (int)Math.pow(c - '0', 5);
        }
        System.out.println(answer);
    }
}