import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        int[] sort = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < sort.length; i++) {
            if (!map.containsKey(sort[i])) {
                map.put(sort[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(map.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
