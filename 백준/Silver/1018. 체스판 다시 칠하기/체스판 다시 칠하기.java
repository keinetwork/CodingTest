import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int xsize = N - 7;
        int ysize = M - 7;
        int[][] testB = new int[M][xsize];
        int[][] testW = new int[M][xsize];
        for (int i = 0; i < M; i++) {
            char[] str = br.readLine().toCharArray();
            for (int k = 0; k < xsize; k++) {
                for (int l = 0; l < 8; l++) {
                    if ((l + i) % 2 == 0) {
                        if (str[k + l] != 'B') {
                            testB[i][k]++;
                        } else {
                            testW[i][k]++;
                        }
                    } else {
                        if (str[k + l] != 'W') {
                            testB[i][k]++;
                        } else {
                            testW[i][k]++;
                        }
                    }
                }

            }
        }
        for (int i = 0; i < ysize; i++) {
            for (int j = 0; j < xsize; j++) {
                for (int k = i + 1; k < 8 + i; k++) {
                    testB[i][j] += testB[k][j];
                    testW[i][j] += testW[k][j];
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ysize; i++) {
            for (int j = 0; j < xsize; j++) {
                ans = Math.min(testB[i][j], ans);
                ans = Math.min(testW[i][j], ans);
            }
        }
        System.out.println(ans);
    }
}