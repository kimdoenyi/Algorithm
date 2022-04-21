package study.book.chap05;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer = {};

        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        Arrays.stream(record).forEach(item ->{
            String[] splitRecord = item.split(" ");

            if(splitRecord[0].equals("Enter") || splitRecord[0].equals("Change")){
                map.put(splitRecord[1], splitRecord[2]);
            }
        });

        Arrays.stream(record).forEach(item -> {
            String[] splitRecord = item.split(" ");

            if(splitRecord[0].equals("Enter")) {
                list.add(map.get(splitRecord[1])+"님이 들어왔습니다.");
            } else if(splitRecord[0].equals("Leave")) {
                list.add(splitRecord[1]+"님이 나갔습니다.");
            }
        });

        list.toArray(new String[list.size()]);

    }
}
