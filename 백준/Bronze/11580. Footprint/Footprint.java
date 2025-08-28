
import java.io.IOException;
import java.util.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<String> answer = null;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String cmd = sc.nextLine();

        int x = 0; int y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(x + " " + y);
        for(char c : cmd.toCharArray()) {
            if(c == 'S'){
                x--;
            }else if(c == 'W') y--;
            else if(c == 'N') x++;
            else y++;
            set.add(x + " " + y);
        }
        System.out.println(set.size());
    }

}
