import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static char[] al;
    static boolean[] visited;
    static int resMax = Integer.MIN_VALUE;
    static int resMin = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] num = new int[4];
        int total = 0;
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            total += num[i];
        }
        al = new char[total];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < num[i]; j++) {
                if (i == 0) {
                    al[index++] = '+';
                }
                if (i == 1) {
                    al[index++] = '-';
                }
                if (i == 2) {
                    al[index++] = '*';
                }
                if (i == 3) {
                    al[index++] = '/';
                }
            }
        }
        visited = new boolean[al.length];
        injection(0, 0);
        System.out.println(resMax);
        System.out.println(resMin);
    }

    public static int cals(int a, int b, char exp) {
        switch (exp) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    public static void injection(int depth, int res) {
        if (depth == visited.length) {
            resMin = Math.min(res, resMin);
            resMax = Math.max(res, resMax);
            return;
        }
        for (int visIndex = 0; visIndex < visited.length; visIndex++) {
            if (depth == 0) {
                res = arr[depth];
            }
            if (!visited[visIndex]) {
                visited[visIndex] = true;
                injection(depth + 1, cals(res, arr[depth + 1], al[visIndex]));
                visited[visIndex] = false;
            }
        }
    }
}