import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            Integer val = map.get(card);
            if (val == null) {
                map.put(card, 1);
            } else {
                map.put(card, val + 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            Integer val = map.get(card);
            if (val == null) {
                sb.append(0);
            } else {
                sb.append(val);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}