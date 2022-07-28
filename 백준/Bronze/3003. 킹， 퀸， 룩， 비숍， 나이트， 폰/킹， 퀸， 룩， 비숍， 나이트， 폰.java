import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int[] pice = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < pice.length; i++) {
            System.out.print(pice[i] - Integer.parseInt(in.nextToken()) + " ");
        }
    }
}