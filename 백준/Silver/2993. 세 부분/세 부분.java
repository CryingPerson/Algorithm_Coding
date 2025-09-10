import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String a = s.substring(0, j);
                    String b = s.substring(j, k);
                    String c = s.substring(k);

                    String ans = reverse(a) + reverse(b) + reverse(c);
                    list.add(ans);
                }
            }
        }
        Collections.sort(list);

        System.out.println(list.get(0));
    }

    static String reverse(String s) {
        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++; right--;
        }
        return new String(ch);
    }
}