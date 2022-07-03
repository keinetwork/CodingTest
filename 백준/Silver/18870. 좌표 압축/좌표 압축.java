import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }
        int index = 0;
        for (Integer i : map.keySet()) {
            map.put(i, index++);
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(map.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
