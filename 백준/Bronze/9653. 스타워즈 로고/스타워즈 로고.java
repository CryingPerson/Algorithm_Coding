import java.util.*;

public class Main {
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("    8888888888  888    88888\n" +
                "   88     88   88 88   88  88\n" +
                "    8888  88  88   88  88888\n" +
                "       88 88 888888888 88   88\n" +
                "88888888  88 88     88 88    888888\n" +
                "\n" +
                "88  88  88   888    88888    888888\n" +
                "88  88  88  88 88   88  88  88\n" +
                "88 8888 88 88   88  88888    8888\n" +
                " 888  888 888888888 88  88      88\n" +
                "  88  88  88     88 88   88888888");


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


