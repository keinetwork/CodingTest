import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(in.nextToken());
        BigInteger m = new BigInteger(in.nextToken());
        System.out.println(n.divide(m));
        System.out.println(n.mod(m));
    }
}