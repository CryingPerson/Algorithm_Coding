import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int mmii = Integer.MAX_VALUE;
    static List<int[]> answer;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> students = new HashMap<>();
        Map<Integer, Integer> times = new HashMap<>();

        List<Integer> cur = new ArrayList<>();
        int idx = 0;

        // 맨처음 없으면 넣는다.
        // 있다면 그거는 그냥 추천수 +1
        // 꽉차있다 그럴떄는 추천수 낮은걸 구하고 가장 낮은게 몇개 있는지에 따라 구별한다
        // 3번을 했다면 여기서 가장낮은 학생을 찾고 그걸 뺴준다

        int time = 0;

        for (int i = 0; i < count; i++) {
            int num = arr[i];

            if (students.containsKey(num)) {
                students.put(num, students.get(num) + 1);
            }else{
                if (idx == n) {
                    List<Integer> cadinates = new ArrayList<>();

                    int min = Integer.MAX_VALUE;


                    for (int key : students.keySet()) {
                        Integer i1 = students.get(key);
                        min = Math.min(min, i1);
                    }
                    for (int number : students.keySet()) {
                        if (students.get(number) == min) {
                            cadinates.add(number);
                        }
                    }

                    int deleteStudent = -1;
                    if (cadinates.size() == 1) {
                        deleteStudent = cadinates.get(0);
                    }else{
                        int min2 = Integer.MAX_VALUE;
                        for (int lll : cadinates) {
                            Integer i1 = times.get(lll);
                            if (i1 < min2) {
                                min2 = i1;
                                deleteStudent = lll;
                            }
                        }
                    }
                    idx--;
                    students.remove(deleteStudent);
                    times.remove(deleteStudent);
                }
                students.put(num, 1);
                idx++;
                times.put(num, time);
            }
            time++;
        }

        List<Integer> anss = new ArrayList<>(students.keySet());
        Collections.sort(anss);

        for (int asdawd : anss) {
            System.out.print(asdawd + " ");
        }
    }
}