import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<Long, String> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            long h1 = Integer.parseInt(st.nextToken()) * 1000000L;
            long h2 = Integer.parseInt(st.nextToken());
            map.put(h1 + h2, str);
        }
        for (Long i : map.keySet()) {
            bw.write(map.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}