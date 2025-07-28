import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int num = a * a % b;
        int save = 0;
        while (true) {
            if(list.contains(num)){
                list.add(num);
                save = num;
                break;
            }else list.add(num);
            num = num *  a % b;
        }

        int i = list.indexOf(save);
        int i1 = list.lastIndexOf(save);
        System.out.println(i1 - i);
    }
}
