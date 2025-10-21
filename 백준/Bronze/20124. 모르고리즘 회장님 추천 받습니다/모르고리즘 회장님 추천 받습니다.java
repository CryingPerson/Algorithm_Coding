import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<info> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String name = sc.next(); int age = sc.nextInt();

            list.add(new info(name, age));
        }

        list.sort(((o1, o2) -> {
            if(o1.age == o2.age){
                return o1.name.compareTo(o2.name);
            }
            return o2.age - o1.age;
        }));

        System.out.println(list.get(0).name);
    }
}
class info{
    String name;
    int age;

    public info(String n, int a){
        this.name =n;
        this.age = a;
    }
}