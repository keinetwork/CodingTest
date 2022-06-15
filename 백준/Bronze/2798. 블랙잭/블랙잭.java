import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int num = card[i] + card[j] + card[k];
                    if (num <= M && num > max) max = num;
                }
            }
        }
        System.out.println(max);
    }
}
