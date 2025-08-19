import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] word = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            map.put(word[i],i);
        }
        List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if(s.equals("***"))break;

            int n = sc.nextInt();
            String[] split = s.split(" ");
            if(n > 0){
                for (int i = 0; i < split.length; i++) {
                    if(split[i].contains("b")){
                        split[i] = word[map.get(split[i].substring(0,1)) - 1];
                    }
                    if(map.get(split[i]) == 11){
                        split[i] = word[0];
                    }else{
                        split[i] = word[map.get(split[i]) + 1];
                    }
                }
                for (int i = 0; i < split.length; i++) {
                    list.add(split[i]);
                }
            }else{
                for (int i = 0; i < split.length; i++) {
                    if(split[i].contains("#")){
                        split[i] = word[map.get(split[i].substring(0,1)) + 1];
                    }
                    if(map.get(split[i]) == 0){
                        split[i] = word[11];
                    }else{
                        split[i] = word[map.get(split[i]) - 1];
                    }
                }
                for (int i = 0; i < split.length; i++) {
                    list.add(split[i]);
                }
            }
            sc.nextLine();
        }
        for (int i = 0; i < list.size(); i += 4) {
            for (int j = i; j < i + 4; j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
}