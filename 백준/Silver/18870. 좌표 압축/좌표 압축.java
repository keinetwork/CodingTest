import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sort = Arrays.stream(arr).toArray();
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
