import java.util.*;

public class Main {
    static String a = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (simulation(s)) {
            System.out.println(a);
        } else {
            System.out.println("I'm Sorry Hansoo");
        }
    }

    static boolean simulation(String s) {

        int[] alpabet = new int[26];
        for (char ch : s.toCharArray()) {
            alpabet[ch - 'A']++;
        }
        char ch[] = new char[s.length()];
        Arrays.fill(ch, '.');
        List<Character> list = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (alpabet[i] != 0) {
                if ( alpabet[i] % 2 == 0) {
                    int num = alpabet[i];

                    for (int j = idx; j < num / 2 + idx; j++) {
                        ch[j] = (char) (i + 'A');
                        ch[ch.length - (j + 1)] = (char) (i + 'A');
                    }
                    idx += num / 2;
                } else if (alpabet[i] % 2 != 0) {
                    int num = alpabet[i];
                    if (num == 1) {
                        list.add((char) (i + 'A'));
                        continue;
                    }
                    int last = num % 2;
                    for (int j = idx; j < num / 2 + idx; j++) {
                        ch[j] = (char) (i + 'A');
                        ch[ch.length - (j + 1)] = (char) (i + 'A');
                    }
                    for (int k = 0; k < last; k++) {
                        list.add((char)(i + 'A'));
                    }
                    idx += num / 2;
                }
            }
        }
        int iddd=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '.'){
                ch[i] = list.get(iddd);
                iddd++;
            }
        }
        String answer = "";
        for (char chs : ch) {
            answer += chs;
            a = answer;
        }
        if(answer.equals(new StringBuilder(answer).reverse().toString())){
            return  true;
        }
        return false;
    }
}
