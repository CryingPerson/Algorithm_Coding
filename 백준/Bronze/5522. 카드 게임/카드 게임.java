import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (int i = 0; i < 5; i++) {
            int score = scanner.nextInt();
            totalScore += score;
        }

        System.out.println(totalScore);
    }
}