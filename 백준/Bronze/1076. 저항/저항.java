import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<color> list = new ArrayList<>();
        list.add(new color("black", 0, 1));
        list.add(new color("brown", 1, 10));
        list.add(new color("red", 2, 100));
        list.add(new color("orange", 3, 1000));
        list.add(new color("yellow", 4, 10000));
        list.add(new color("green", 5, 100000));
        list.add(new color("blue", 6,  1000000));
        list.add(new color("violet", 7,10000000));
        list.add(new color("grey", 8,  100000000));
        list.add(new color("white", 9, 1000000000));
        String s = sc.nextLine();
        String b = sc.nextLine();
        String ans = "";
        String last = sc.nextLine();
        long x = 0;
        for(color c : list){
            if(c.color.equals(s)){
                ans += String.valueOf(c.val);
            }
            if(c.color.equals(last)){
                x = c.mutix;
            }
        }
        for(color c : list){
            if(c.color.equals(b)){
                ans += String.valueOf(c.val);
            }
        }
        long a = Integer.parseInt(ans);

        long answer = a * x;
        System.out.println(answer);

    }
}
class color{
    String color;
    long val;
    long mutix;
    public color(String color, long val, long mutix) {
        this.color = color;
        this.val = val;
        this.mutix = mutix;
    }
}
