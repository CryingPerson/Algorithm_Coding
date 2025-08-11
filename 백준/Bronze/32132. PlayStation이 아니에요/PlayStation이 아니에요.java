import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            if(list.size() >= 3){
                int size = list.size();
                if(list.get(size-3) == 'P' && list.get(size-2) == 'S' && (list.get(size-1) == '4' || list.get(size-1) == '5')){
                    list.remove(size-1);
                }
            }
        }
        for(char c : list) System.out.print(c);
    }
}
