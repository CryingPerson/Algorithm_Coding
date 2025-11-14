import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int len = n.length();

        StringBuilder compare = new StringBuilder();

        for (int i = 0; i < len; i++) {
            compare.append("1");
        }

        int com = Integer.parseInt(compare.toString());

        if(n.length() == 1){
            System.out.println(1);
            return;
        }
        if (Integer.parseInt(n) >= com) {
            System.out.println(n.length());
        }else{
            System.out.println(n.length() - 1);
        }
    }
}
