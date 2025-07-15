import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            if(check(s)){
                System.out.println(split[0] + " & " + split[1] + " are anagrams.");
            }else{
                System.out.println(split[0] + " & " + split[1] + " are NOT anagrams.");
            }
        }
    }

    static boolean check(String s) {
        String[] split = s.split(" ");

        int[] alpaet = new int[26];int[] alpaet2 = new int[26];

        for (char c : split[0].toCharArray()) {
            alpaet[c - 'a']++;
        }

        for (char c : split[1].toCharArray()) {
            alpaet2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(alpaet2[i] != alpaet[i]) return false;
        }
        return true;
    }

}
