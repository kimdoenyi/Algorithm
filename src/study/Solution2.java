package study;

import java.util.*;

/**
 * 수험자번호 문제번호 점수
 * 1. 두 수험자가 푼 문제 수가 같다. 단, 푼 문제 수가 5 미만인 경우는 제외한다.
 * 2. 두 수험자가 푼 문제의 번호가 모두 같다.
 * 3. 두 수험자가 푼 문제의 점수가 모두 같다.
 */
public class Solution2 {

    public static void solution(String[] logs) {

        String[][] arrays = new String[logs.length][3];
        Map<String, String> map = new HashMap<>();

        /*
        for(int i=0; i<logs.length; i++) {
            for(int j=0; j<3; j++) {
                arrays[i][j] = logs[i].split(" ")[j];
                System.out.print(arrays[i][j]+' ');
            }
            System.out.println();
        }
        */
        Arrays.sort(logs, Collections.reverseOrder());
        Arrays.stream(logs).forEach(item ->{
            String[] splitRecord = item.split(" ");
            map.put(splitRecord[0]+" "+splitRecord[1], splitRecord[2]);
        });

        map.forEach((key, value) -> {
            String[] keySet = key.split(" ");

        });

        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
        }

        //return arrays;
    }

    public static void main(String[] args) {
        String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100",
                        "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90",
                        "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        Solution2.solution(logs);
    }
}
