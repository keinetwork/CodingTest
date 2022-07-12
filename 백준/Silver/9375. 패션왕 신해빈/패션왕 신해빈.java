import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                StringTokenizer in = new StringTokenizer(br.readLine());
                in.nextToken();
                String kind = in.nextToken();
                Integer val = map.get(kind);
                if (val != null) {
                    map.put(kind, val + 1);
                } else {
                    map.put(kind, 1);
                }
            }
            int res = 1;
            for (String s : map.keySet()) {
                res *= (map.get(s) + 1);
            }
            out.append(res - 1).append("\n");
            map.clear();
        }
        System.out.println(out);
    }
}