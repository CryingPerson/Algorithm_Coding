import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();


        //daramari
        //darmurui
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();

        int[] alpabet = new int[26];
        int[] alpabet2 = new int[26];

        for(char c : a1.toCharArray()){
            alpabet[c - 'a']++;
        }


        for(char c : a2.toCharArray()){
            alpabet2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(alpabet[i] != alpabet2[i]){
                System.out.println("NO");
                return;
            }
        }

        if(a1.charAt(0) != a2.charAt(0) || a1.charAt(a1.length() - 1) != a2.charAt(a2.length() - 1)){
            System.out.println("NO");
            return;
        }

        a1 = a1.replaceAll("[aiueo]","");
        a2 = a2.replaceAll("[aiueo]", "");

        if(!a1.equals(a2)){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}