import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int An = Integer.parseInt(str.nextToken());
        int Bn = Integer.parseInt(str.nextToken());
        int answer = 0;
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> Astore = new HashSet<>();
        for (int i = 0; i < An; i++) {
            Astore.add(Integer.parseInt(st.nextToken()));
        }
        StringTokenizer stt = new StringTokenizer(br.readLine());
        HashSet<Integer> Bstore = new HashSet<>();
        for (int i = 0; i < Bn; i++) {
            Bstore.add(Integer.parseInt(stt.nextToken()));
        }
        for (Integer i : Astore) {
            if(Bstore.contains(i))answer++;
        }
        ans = Bstore.size()-answer;
        answer = 0;
        for (Integer i : Bstore) {
            if(Astore.contains(i))
            answer++;
        }
        ans += Astore.size() -answer;
        System.out.println(ans);
    }

}