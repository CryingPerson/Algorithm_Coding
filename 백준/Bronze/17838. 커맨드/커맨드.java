import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();

            boolean check = check(s);
            if (check) {
                if(s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(4) && s.charAt(2) == s.charAt(3) &&
                        s.charAt(5) == s.charAt(6)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else System.out.println(0);
        }
    }

    static boolean check(String s) {
        if(s.length() != 7) return false;

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) set.add(c);

        if(set.size() != 2) return false;

        return true;
    }
}