import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            if (i > 2) {
                sb.append(i).append(" bottles of beer on the wall, ");
                sb.append(i).append(" bottles of beer.");
                sb.append("\n");
                int num = i - 1;
                sb.append("Take one down and pass it around, "); sb.append(num).append(" bottles of beer on the wall.");
                sb.append("\n");
            } else if (i == 2) {
                sb.append(i).append(" bottles of beer on the wall, 2 bottles of beer.");
                sb.append("\n");
                int num = i - 1;
                sb.append("Take one down and pass it around, "); sb.append(num).append(" bottle of beer on the wall.");
                sb.append("\n");
            } else if (i == 1) {
                sb.append(i).append(" bottle of beer on the wall, 1 bottle of beer.");
                sb.append("\n");
                sb.append("Take one down and pass it around, no more bottles of beer on the wall.");
                sb.append("\n");
            }else{
                sb.append("No more bottles of beer on the wall, no more bottles of beer.");
                sb.append("\n");
                if (n > 1) {
                    sb.append("Go to the store and buy some more, ");
                    sb.append(n).append(" bottles of beer on the wall.");
                }else{
                    sb.append("Go to the store and buy some more, ");
                    sb.append(n).append(" bottle of beer on the wall.");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}