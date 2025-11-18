import java.util.*;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for (int i = 0; i < 4; i++) a[i] = sc.nextInt();

        int diff1 = Math.abs((a[0] + a[3]) - (a[1] + a[2]));
        int diff2 = Math.abs((a[0] + a[2]) - (a[1] + a[3]));
        int diff3 = Math.abs((a[0] + a[1]) - (a[2] + a[3]));

        System.out.println(Math.min(diff1, Math.min(diff2, diff3)));

    }

}
interface sd{
    void pay();
    void findsy();
}

interface naver extends sd{
    void find();
}

class impls implements naver{

    @Override
    public void find() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void findsy() {

    }
}


