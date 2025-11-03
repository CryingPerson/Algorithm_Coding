import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            List<info> list = new ArrayList<>();
            boolean end = false;
            Map<String, Integer> map = new HashMap<>();
            int count = 0;

            for (String s : line.split(" ")) {
                list.add(new info(Integer.parseInt(s.substring(0, s.length() - 1)), s.substring(s.length() - 1)));
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            List<Integer> list1 = new ArrayList<>();
            for (int mp : map.values()) {
                if (mp >= 3) {
                    System.out.println(":)");
                    end = true;
                    break;
                }
                list1.add(mp);
            }

            if (list1.size() == 2) {
                if (list1.get(0) == 2 && list1.get(1) == 2) {
                    System.out.println(":)");
                    continue;
                }
            }

            if (end) continue;

            list.sort((o1, o2) -> o1.num - o2.num);

            String[] ss = {"m", "p", "s"};
            int[] arr = new int[3];
            for (info llll : list) {
                for (int j = 0; j < ss.length; j++) {
                    if (llll.key.equals(ss[j])) {
                        arr[j]++;

                    }
                }
            }

            int max = Arrays.stream(arr).max().getAsInt();

            if (max >= 3) {
                boolean tss = false;
                String[] types = {"m", "p", "s"};

                for (String type : types) {
                    List<Integer> nums = new ArrayList<>();
                    for (info card : list) {
                        if (card.key.equals(type)) {
                            if(!nums.contains(card.num)) nums.add(card.num);
                        }
                    }
                    if (nums.size() >= 3) {
                        Collections.sort(nums);
                        for (int j = 0; j + 2 < nums.size(); j++) {
                            if (nums.get(j + 1) == nums.get(j) + 1 &&
                                    nums.get(j + 2) == nums.get(j + 1) + 1) {
                                tss = true;
                                break;
                            }
                        }
                    }
                    if (tss) break;
                }

                if (tss) System.out.println(":)");
                else System.out.println(":(");
            } else System.out.println(":(");
        }
    }
}

class info {
    int num;
    String key;

    public info(int num, String key) {
        this.num = num;
        this.key = key;
    }
}
