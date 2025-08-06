import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        List<Integer> save = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(Character.isUpperCase(ch)){
                save.add(i);
            }
        }

        int total = 0;
        for (int i = 0; i < save.size() - 1; i++) {
            int idx = save.get(i+1);
            int first = save.get(i);

            if((idx + total)% 4 == 0 && (first + total) % 4 ==0 ) continue;
            int plus = -1;
            int diff = idx - first;

            if(diff <= 4){
                total += 4 - (save.get(i+1) - save.get(i));
            }else{
                plus = diff / 4;
                first = first + (4 * plus);

                total += 4 - ((idx+plus) - first);
                total += plus;
            }
        }
        System.out.println(total);
    }
}
