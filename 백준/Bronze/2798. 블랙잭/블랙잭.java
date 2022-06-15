import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int[] card = new int[N];
        token = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(token.nextToken());
        }
        int answer = black(card, N, M);
        System.out.println(answer);
    }

    private static int black(int[] arr, int N, int M) {
        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > M) continue;
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] + arr[j] > M) continue;
                for (int k = j + 1; k < N; k++) {
                    int num = arr[i] + arr[j] + arr[k];
                    if (M == max) {
                        return max;
                    }
                    if (num <= M && num > max) max = num;
                }
            }
        }
        return max;
    }
}
