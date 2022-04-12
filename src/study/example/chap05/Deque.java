package study.example.chap05;

/**
 * 덱큐
 * 양쪽으로 다 들어오고 나갈 수 있음
 */
public class Deque {

    public static int begin = 0;
    public static int end = 0;
    public static int[] deque = new int[end];

    public void pushFront(int val) {
        deque[begin] = val;
        
    }
}
