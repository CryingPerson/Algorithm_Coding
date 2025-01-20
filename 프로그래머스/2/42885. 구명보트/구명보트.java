import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        // 1. 사람들의 몸무게를 오름차순으로 정렬
        Arrays.sort(people);

        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스
        int boats = 0; // 필요한 구명보트 수

        // 2. 투 포인터를 사용하여 가장 가벼운 사람과 가장 무거운 사람을 짝지음
        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람의 합이 무게 제한을 초과하면
            if (people[left] + people[right] <= limit) {
                left++; // 가벼운 사람을 태움
            }
            // 가장 무거운 사람은 항상 태움 (혼자라도 보트를 사용해야 함)
            right--;
            // 구명보트 사용
            boats++;
        }

        return boats;
    }
}
