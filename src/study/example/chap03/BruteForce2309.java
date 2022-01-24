package study.example.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        //System.out.println("sum = " + sum);
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    for(int k=0; k<arr.length; k++) {
                        if(arr[k] == arr[i] || arr[k] == arr[j]) {
                            continue;
                        } else {
                            System.out.println(arr[k]);
                        }

                    }
                    System.exit(0);
                }
            }
        }


    }
}
