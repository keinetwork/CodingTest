import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int res = A + B;

        int[] arrA = new int[A];
        int[] arrB = new int[B];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int n = 0, m = 0;
        ArrayList<String> list = new ArrayList<>();
        while (n < A && m < B) {
            int diff = arrA[n] - arrB[m];
            if (diff == 0) {
                res -= 2;
                n++;
                m++;
            } else if (diff < 0) {
                n++;
            } else {
                m++;
            }
        }
        System.out.println(res);
    }
}