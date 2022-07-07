import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];    // 입력받아 초기화 되어있는 상태라고 가정
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);    // 정렬
        int gcdVal = arr[1] - arr[0];    // 음수가 되지 않도록 큰 수에서 작은 수로 빼준다.
        for (int i = 2; i < N; i++) {
            // 직전의 최대 공약수와 다음 수(arr[i] - arr[i - 1])의 최대공약수를 갱신
            gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
        }
        // 최대공약수의 약수들 찾기
        for (int i = 2; i <= gcdVal; i++) {
            // i가 최대공약수의 약수라면 출력
            if (gcdVal % i == 0) {
                out.append(i + " ");
            }
        }
        System.out.println(out);

    }

    // 최대공약수 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}