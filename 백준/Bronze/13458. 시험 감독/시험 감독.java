import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        float C = Integer.parseInt(st.nextToken());
        int chong = 0;
        long bu = 0;
        for (int i = 0; i < N; i++) {
            A[i] -= B;
            chong++;
            if (A[i]>0) {
                bu += Math.ceil(A[i] / C);
            }
        }

        System.out.println(chong+bu);
    }
}
