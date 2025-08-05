import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        StringBuilder sb = new StringBuilder();
        while (true) {
            String word = sc.nextLine();
            if(word.equals("#")) break;
            for (String s : word.split(" ")) {
                sb.append(new StringBuilder(s).reverse()).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
