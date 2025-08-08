import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        List<String> list =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (list.contains(s)) {
                System.out.print(s.length() + " ");
                System.out.println(s.charAt(s.length()/2));
                return;
            }
            String string = new StringBuilder(s).reverse().toString();
            if(s.equals(string)){
                System.out.print(s.length() + " ");
                System.out.println(s.charAt(s.length()/2));
                return;
            }else{
                list.add(s); list.add(string);
            }
        }
    }
}
