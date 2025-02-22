import java.io.*;
import java.util.*;

class Main {
    static int[][] board = new int[11][11]; // -5 ~ 5의 범위를 0 ~ 10으로 매핑
    static int[] dx = {-1,0,1,0}; // U, D, L, R
    static int[] dy = {0,1,0,-1}; // U, D, L, R

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());

        HashMap<String ,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.length() < m) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> {
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if(count1 != count2){
                return count2- count1;
            }else if(o1.length() != o2.length()){
                return o2.length() - o1.length();
            }else{
                return o1.compareTo(o2);
            }

        }));
        for(String x : list){
            bw.write(x);
            bw.newLine();
        }
        br.close();
        bw.flush(); // 마지막에 한 번만 flush
        bw.close();
    }
}