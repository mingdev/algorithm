package programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];

            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        Iterator<Integer> it = map.values().iterator();

        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] colthes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(colthes));
    }

}
