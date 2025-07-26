import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();
            if (n == 0) break;
            sc.nextLine();
            double max = -1;
            List<Info> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next();
                double height = sc.nextDouble();
                list.add(new Info(name, height));
                if (height > max) {
                    max = height;
                }
            }

            for (int i = 0; i < n; i++) {
                Info info = list.get(i);
                if (info.height == max) {
                    System.out.print(info.name + " ");
                }
            }

            System.out.println(); 
        }
    }
}

class Info {
    String name;
    double height;

    public Info(String name, double height) {
        this.name = name;
        this.height = height;
    }
}
