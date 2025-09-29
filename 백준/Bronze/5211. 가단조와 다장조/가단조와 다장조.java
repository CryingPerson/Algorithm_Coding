import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] music = s.split("\\|");

        List<Character> list = new ArrayList<>();
        char[] ga = {'A','D','E'};
        char[] da = {'C','F','G'};
        int gas = 0; int das = 0;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < music.length; i++) {
            char c = music[i].charAt(0);
            for (int j = 0; j < 3; j++) {
                if(c == ga[j]){
                    gas++;
                    break;
                }else if(c == da[j]){
                    das++;
                    break;
                }
            }
        }
        if (gas > das) {
            System.out.println("A-minor");
        }else if(gas < das){
            System.out.println("C-major");
        }else{
            boolean ok = false;
            char c = list.get(list.size() - 1);
            for (int i = 0; i < 3; i++) {
                if (c == da[i]) {
                    ok = true;
                    break;
                }
            }
            if(ok){
                System.out.println("C-major");
            }else{
                System.out.println("A-minor");
            }
        }
    }
}