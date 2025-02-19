import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int get_have = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(),0);
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(map.containsKey(s)){
                get_have++;
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(get_have);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
