import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    static char[] Adrian = {'A','B','C'};
    static char[] Bruno = {'B','A','B','C'};
    static char[] Goran = {'C','C','A','A','B','B'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        char[] st = new char[n];

        sc.nextLine();
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            st[i] = s.charAt(i);
        }

        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(st[i] == Adrian[i % Adrian.length]) a++;
            if(st[i] == Bruno[i % Bruno.length]) b++;
            if(st[i] == Goran[i % Goran.length]) c++;
        }
        int max = Math.max(Math.max(a, b), c);

        List<info> list = new ArrayList<>();
        list.add(new info(a, "Adrian"));
        list.add(new info(b, "Bruno"));
        list.add(new info(c, "Goran"));

        System.out.println(max);
        
        for (info li : list) {
            if (li.num == max) {
                System.out.println(li.name);
            }
        }

    }
}
class info{
    int num;
    String name;

    public info(int num, String name) {
        this.num = num;
        this.name = name;
    }
}