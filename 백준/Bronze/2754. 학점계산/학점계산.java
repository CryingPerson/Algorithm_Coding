import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        scanner.close();

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.3);
        gradeMap.put("A0", 4.0);
        gradeMap.put("A-", 3.7);
        gradeMap.put("B+", 3.3);
        gradeMap.put("B0", 3.0);
        gradeMap.put("B-", 2.7);
        gradeMap.put("C+", 2.3);
        gradeMap.put("C0", 2.0);
        gradeMap.put("C-", 1.7);
        gradeMap.put("D+", 1.3);
        gradeMap.put("D0", 1.0);
        gradeMap.put("D-", 0.7);
        gradeMap.put("F", 0.0);

        
        if (gradeMap.containsKey(grade)) {
            System.out.println(gradeMap.get(grade));
        } else {
            System.out.println("잘못된 성적입니다.");
        }
    }
}