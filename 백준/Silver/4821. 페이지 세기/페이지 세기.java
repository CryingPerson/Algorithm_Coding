import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            sc.nextLine();
            String line = sc.nextLine();

            String[] split = line.split(",");

            boolean[] visited = new boolean[n + 1];
            for (String s : split) {
                String[] split1 = s.split("-");

                int start;
                int end;
                if (split1.length == 2) {
                    start = Integer.parseInt(split1[0]);
                    end = Integer.parseInt(split1[1]);

                    if(start > end) continue;
                    for (int i = start; i <= end; i++) {
                        if(i >= visited.length)break;
                        if (!visited[i]) visited[i] = true;
                    }
                }else{
                    int num = Integer.parseInt(split1[0]);
                    if(num >= visited.length) continue;
                    if(!visited[Integer.parseInt(split1[0])]){
                        visited[Integer.parseInt(split1[0])] = true;
                    }
                }
            }
            int count = 0;
            for (int j = 1; j < visited.length; j++) {
                if (visited[j]) count++;
            }
            System.out.println(count);
        }
    }
}
