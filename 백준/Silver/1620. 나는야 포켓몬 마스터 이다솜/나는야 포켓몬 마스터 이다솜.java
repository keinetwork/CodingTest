import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (str.charAt(0) <= 57) {
                sb.append(arr[Integer.parseInt(str) - 1]).append("\n");
            } else {
                sb.append(map.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }
}