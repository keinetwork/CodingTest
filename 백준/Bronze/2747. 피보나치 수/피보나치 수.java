import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(proceed(n));
    }
    public static int proceed(int n){
        int[] pibo = new int[n+1];
        pibo[0] = 0;
        pibo[1] = 1;
        for (int i = 2; i <=n ; i++) {
            pibo[i] = pibo[i-1]+pibo[i-2];
        }
        return pibo[n];
    }
}