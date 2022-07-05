import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int offset = 10_000_000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[offset * 2 + 1];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken()) + offset]++;
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(arr[Integer.parseInt(st.nextToken()) + offset]).append(" ");
        }
        System.out.println(sb);
    }
}