import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Top[] top = new Top[3];

    public static void hanoit(boolean odd, int a, int b) throws IOException {
        if (top[a].isEmpty()) {
            return;
        }
        int p = top[a].pop();
        top[b].push(p);
        bw.write((a + 1) + " " + (b + 1) + "\n");
        if (odd) {
            a = ++a % 3;
            b = ++b % 3;
        } else {
            a = (a + 2) % 3;
            b = (b + 2) % 3;
        }

        if (top[a].isEmpty() || (!top[b].isEmpty() && top[a].get() > top[b].get())) {
            int temp = a;
            a = b;
            b = temp;
        }
        hanoit(odd, a, b);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 3; i++) {
            top[i] = new Top(N);
        }
        for (int i = N; i > 0; i--) {
            top[0].push(i);
        }
        bw.write(((int) Math.pow(2, N)) - 1 + "\n");
        hanoit(N % 2 == 1, 0, N % 2 + 1);
        bw.flush();
    }

    static class Top {
        int[] top;
        int index;

        Top(int size) {
            top = new int[size];
            index = size;
        }

        boolean isEmpty() {
            return index == top.length;
        }

        int get() {
            if (isEmpty()) return 0;
            return top[index];
        }

        int pop() {
            int p = top[index];
            top[index++] = 0;
            return p;
        }

        void push(int val) {
            top[--index] = val;
        }

        String print() {
            return Arrays.toString(top);
        }
    }
}