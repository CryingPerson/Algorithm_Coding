import java.util.*;

public class Main {
    static String[][] time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] ch = new char[n];
        sc.nextLine();
        String line = sc.nextLine();
        for (int i = 0; i < n; i++) ch[i] = line.charAt(i);

        int games = sc.nextInt();

        int curPoint = 0;
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < games; i++) {
            String game = sc.nextLine();
            curPoint += get(game, ch);
            list.add(game);
        }
        System.out.println(curPoint);
        int ans = simul(ch, list);
        System.out.println(ans);
    }

    static int simul(char[] ch, List<String> list) {


        int max = -1;
        char[] chs = {'R','S','P'};

        int answer = 0;
        for (int j = 0; j < list.get(0).length(); j++) {
            max = -1;
            for (int i = 0; i < 3; i++) {
                char ssss = chs[i];
                int total = 0;
                for (int k = 0; k < list.size(); k++) {
                    char c = list.get(k).charAt(j);
                    if (ssss == c) total++;
                    else if (ssss == 'S' && c == 'P') total += 2;
                    else if (ssss == 'R' && c == 'S') total += 2;
                    else if (ssss == 'P' && c == 'R') total += 2;
                }
                max = Math.max(max, total);
            }
            answer += max;
        }
        return answer;
    }

    static int get(String s, char[] chars) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars[i] == c) total++;
            else if (chars[i] == 'S' && c == 'P') total += 2;
            else if (chars[i] == 'R' && c == 'S') total += 2;
            else if (chars[i] == 'P' && c == 'R') total += 2;
        }
        return total;
    }
}
