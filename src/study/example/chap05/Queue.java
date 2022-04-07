package study.example.chap05;

import java.util.Scanner;

/**
 * 큐 구현하기
 * 한쪽으로 들어오고 한쪽으로 나간다.
 * push , pop, empty, front, back, size
 * ArrayList 로 pop 안됨
 * 주로 배열이나 LinkedList
 */
public class Queue {

    public static Scanner sc = new Scanner(System.in);
    public static int begin = 0;
    public static int end = 0;
    public static int[] queue = new int[end];

    public void push(int val) {
        queue[end] = val;
        end += 1;
    }

    public void pop() {
        queue[begin] = 0;
        begin += 1;
    }

    public boolean empty() {
        if(begin == end) {
            return true;
        }
        return false;
    }

    public int front() {
        return queue[begin];
    }

    public int back() {
        return queue[end];
    }

    public int size() {
        return end-begin;
    }
}
