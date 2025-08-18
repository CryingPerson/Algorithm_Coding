import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();

        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            arr[i] = word;
        }


        int index = 0;
        for (int j = 0; j < 25; j++) {
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < s.length(); k++) {
                char c = s.charAt(k);
                char c1 = ' ';
                if(Character.isUpperCase(c)){
                    c1 = (char)((c - 'A' + j) % 26 + 'A');
                }else{
                    c1 = (char) ((c - 'a' + j) % 26 + 'a');
                }
                sb.append(c1);
            }
            if(check(arr, sb)){
                System.out.println(sb);
                return;
            }
        }
    }
    static boolean check(String[] arr, StringBuilder sb) {
        String s = sb.toString();

        for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])){
                return true;
            }
        }
        return false;
    }
}