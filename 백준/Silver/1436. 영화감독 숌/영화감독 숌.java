import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(find(N));
    }

    public static int find(int N) {
        int ans = 0; // 영화 제목
        int cnt = 0; // 현재 몇번쨰 종말의 수인지

        int temp = 0;
        while (cnt != N) {
            ans++;
            temp = ans;
            // 수에 6이 적어도 3개이상 들어가는지 판별
            while (temp != 0) {
                if (temp % 1000 == 666) { // 종말의 숫자라면
                    cnt++;
                    break;
                } else {
                    temp /= 10;// 일의 자리수 삭제
                }
            }
        }
        return ans;
    }
}