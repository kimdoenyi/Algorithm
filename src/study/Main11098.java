package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main11098 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        while(tc != 0) {

            int count = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;

            Map<Integer, String> hashMap = new HashMap<>();

            for(int i=0; i<count; i++) {
                st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if(price >= max) {
                    max = price;
                }

                hashMap.put(price, name);
            }

            System.out.println("hashMap.get(max) = " + hashMap.get(max));
            tc--;

        }
    }
}
