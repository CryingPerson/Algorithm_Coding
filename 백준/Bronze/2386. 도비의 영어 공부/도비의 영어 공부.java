import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] lines = sc.nextLine().split(" ");

            if(lines[0].equals("#")) break;
            lines[0] = lines[0].toLowerCase();
            int cnt = 0;
            for (int i = 1; i < lines.length; i++) {
                lines[i] = lines[i].toLowerCase();
                for (int j = 0; j < lines[i].length(); j++) {
                    if(lines[i].charAt(j) == lines[0].charAt(0))
                        cnt++;
                }
            }
            System.out.println(lines[0] + " " + cnt);
        }
    }
}
