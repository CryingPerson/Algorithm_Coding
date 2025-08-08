import java.util.*;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 1;
        while (true){
            String a = sc.nextLine();
            String b = sc.nextLine();

            List<String> list = new ArrayList<>();
            if(a.equals("END") && b.equals("END")) break;


            list.add(a); list.add(b);

            if(check(list)){
                System.out.println("Case " + idx++ + ":" + " same");
            }else{
                System.out.println("Case " + idx++ + ":" + " different");
            }
        }

    }

    static boolean check(List<String> list) {
        char[] ch1 = list.get(0).toCharArray();

        Arrays.sort(ch1);
        char[] ch2 = list.get(1).toCharArray();

        Arrays.sort(ch2);


        if(ch1.length != ch2.length) return false;
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]) return false;
        }
     return true;
    }
}
