import java.util.Scanner;

class Main{
    static char[] moum = {'a','i','u','e','o'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] lines = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                char c = lines[i].charAt(j);
                boolean ok = false;
                for (int k = 0; k < 5; k++) {
                    if (c == moum[k]) {
                        ok = true;
                        break;
                    }
                }
                if (ok) {
                    sb.append(c);
                    j += 2;
                }else{
                    sb.append(c);
                }
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}