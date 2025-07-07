import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BigInteger bigInteger = new BigInteger(sc.next());
        BigInteger bigInteger1 = new BigInteger(sc.next());

        System.out.println(bigInteger1.add(bigInteger));
    }
}
