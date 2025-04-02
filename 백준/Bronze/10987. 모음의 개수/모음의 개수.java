import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // 단어 입력
        int count = 0;

        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
