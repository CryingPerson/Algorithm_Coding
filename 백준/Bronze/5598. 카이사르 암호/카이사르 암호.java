import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cipherText = sc.nextLine(); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            char decoded = (char)((ch - 'A' - 3 + 26) % 26 + 'A');
            sb.append(decoded);
        }

        System.out.println(sb.toString());
    }
}
