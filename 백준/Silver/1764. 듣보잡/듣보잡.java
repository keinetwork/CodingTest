import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] noHear = new String[N];
        String[] noSee = new String[M];
        for (int i = 0; i < N; i++) {
            noHear[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            noSee[i] = br.readLine();
        }
        Arrays.sort(noHear);
        Arrays.sort(noSee);
        int n = 0, m = 0;
        ArrayList<String> list = new ArrayList<>();
        while (n < N && m < M) {
            int diff = noHear[n].compareTo(noSee[m]);
            if (diff == 0) {
                list.add(noHear[n]);
                n++;
                m++;
            } else if (diff < 0) {
                n++;
            } else {
                m++;
            }
        }

        bw.write(list.size() + "\n");
        for (String str : list) {
            bw.write(str + "\n");
        }
        bw.flush();
    }
}