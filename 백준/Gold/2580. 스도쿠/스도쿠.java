import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] a = new int[10][10];
    static boolean[][] c = new boolean[10][10];
    static boolean[][] c2 = new boolean[10][10];
    static boolean[][] c3 = new boolean[10][10];
    static int n = 9;
    static int cnt = 0;

    static int square(int x, int y) {
        return (x / 3) * 3 + (y / 3);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(in.nextToken());
                int val = a[i][j];
                if (a[i][j] != 0) {
                    c[i][val] = true;
                    c2[j][val] = true;
                    c3[square(i, j)][val] = true;
                }
            }
        }
        go(0);
    }

    static boolean go(int z) {
        cnt += 1;
        if (cnt >= 10000000) {
            return true;
        }
        if (z == 81) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }

        int x = z / n;
        int y = z % n;
        if (a[x][y] != 0) {
            return go(z + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (c[x][i] == false && c2[y][i] == false && c3[square(x, y)][i] == false) {
                    c[x][i] = c2[y][i] = c3[square(x, y)][i] = true;
                    a[x][y] = i;
                    if (go(z + 1)) {
                        return true;
                    }
                    a[x][y] = 0;
                    c[x][i] = c2[y][i] = c3[square(x, y)][i] = false;
                }
            }
        }
        return false;
    }

}