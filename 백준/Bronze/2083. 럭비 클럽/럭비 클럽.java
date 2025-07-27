import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            String[] split = s.split(" ");
            if(split[0].equals("#") && split[1].equals("0") && split[2].equals("0")) break;

            if(Integer.parseInt(split[1]) > 17 || Integer.parseInt(split[2]) >= 80){
                System.out.println(split[0] + " " + "Senior");
            }else{
                System.out.println(split[0] + " "  + "Junior");
            }
        }

    }
}
