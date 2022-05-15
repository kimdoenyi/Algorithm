package study;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    static int answer = 0;
    public static int solution(int [] v, int a, int b){
        findMaxFuel(v, a, b);
        return answer;
    }

    public static void findMaxFuel(int[] v, int a, int b) {
        int max = 0;
        int findMaxIndex = 0;

        for(int i=0; i<v.length; i++) {
            if(v[i] > max) {
                max = v[i];
                findMaxIndex = i;
            }
        }

        for(int i=0; i<v.length; i++) {
            if(i == findMaxIndex) {
                if(v[i] < a) {
                    return;
                }
                v[i] -= a;
            } else {
                if(v[i] < b) {
                    return;
                }
                v[i] -= b;
            }
        }
        answer += 1;
        findMaxFuel(v, a, b);
    }

    public static int test(int [] v, int maxIndex, int a, int b) {
        int count = 0;

        for(int i=0; i<v.length; i++) {
            if(i == maxIndex) {
                v[i] -= a;
            } else {
                v[i] -= b;
            }
        }

        return count += 1;
    }

    public static void main(String[] args) {
        int a[] = {4, 4, 3};

        System.out.println(Solution.solution(a, 2, 1));
        
    }
}
