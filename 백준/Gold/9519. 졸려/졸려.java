import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // abcdef

        // afbecd

        // adfcbe

        // k = lengh / 2;
        // k = 3
        // i += 2

        // 5 3 1


        int n = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();

        List<String> list = new ArrayList<>();

        list.add(s);
        String ori = s;

        int k = s.length();

        while (true) {
            StringBuilder sb = new StringBuilder();
            if (k % 2 == 0) {
                for (int j = 0; j < s.length(); j += 2) {
                    sb.append(s.charAt(j));
                }
                for (int j = s.length() - 1; j >= 1; j -= 2) {
                    sb.append(s.charAt(j));
                }
                s = sb.toString();
            } else {
                for (int j = 0; j < s.length(); j += 2) {
                    sb.append(s.charAt(j));
                }
                for (int j = s.length() - 2; j >= 1; j -= 2) {
                    sb.append(s.charAt(j));
                }
                s = sb.toString();
            }
            if(s.equals(ori))break;
            list.add(s);
        }
        System.out.println(list.get(n % list.size()));
    }
}