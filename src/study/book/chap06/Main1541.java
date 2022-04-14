package study.book.chap06;

import java.util.Scanner;

public class Main1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String data = sc.next();
        int answer = 0;
        String[] splitDataArray = data.split("-");
        
        for(int i=0; i<splitDataArray.length; i++) {
            int temp = sum(splitDataArray[i]);

            if(i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    static int sum(String num) {
        int sum = 0;
        String[] temp = num.split("\\+");

        for(int i=0; i< temp.length; i++) {
            System.out.println(temp[i]);
            sum += Integer.parseInt(temp[i]);
        }

        return sum;
    }
}
