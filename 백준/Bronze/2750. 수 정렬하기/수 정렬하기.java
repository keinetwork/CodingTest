import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            list.add(val);
        }
        Collections.sort(list);
        for (Integer val : list) {
            bw.write(val.toString());
            bw.newLine();
        }
        bw.flush();
    }
}