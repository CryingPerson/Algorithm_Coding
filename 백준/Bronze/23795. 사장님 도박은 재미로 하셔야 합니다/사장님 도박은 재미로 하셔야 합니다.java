import java.util.*;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum=  0;
        while (true) {
            int num = sc.nextInt();
            if(num == -1) break;
            sum += num;
        }
        System.out.println(sum);

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


