import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static Set<String> strings = new HashSet<>();
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            check(i+1, s);
        }
    }

    static void check(int q ,String s) {
        String lowerCase = s.toLowerCase();
        int[] arr = new int[26];
        for(char ch : lowerCase.toCharArray()){
            if(!Character.isAlphabetic(ch)) continue;
            arr[ch - 'a']++;
        }
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if(arr[i] == 0) {
                System.out.println("Case " + q + ": " + "Not a pangram");
                return;
            }
            if(arr[i] == 1) a++;
            if(arr[i] == 2) b++;
            if(arr[i] == 3) c++;
        }
        int asInt = Arrays.stream(arr).min().getAsInt();
        if(asInt == 1){
            System.out.println("Case " + q + ": " +"Pangram!");
        }else if(asInt == 2){
            System.out.println("Case " + q + ": " +"Double pangram!!");
        }else{
            System.out.println("Case " + q + ": " +"Triple pangram!!!");
        }
    }
}

