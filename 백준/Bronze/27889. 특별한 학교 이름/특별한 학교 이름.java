import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS","Korea International School");
        map.put("SJA","St. Johnsbury Academy");

        System.out.println(map.get(sc.nextLine()));
    }
}