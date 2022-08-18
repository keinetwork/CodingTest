import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(minus(br.readLine()));
    }

    public static int plus(String str){
        StringTokenizer st = new StringTokenizer(str, "+");
        int ret = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()){
            ret += Integer.parseInt(st.nextToken());
        }
        return ret;
    }

    public static int minus(String str){
        StringTokenizer st = new StringTokenizer(str, "-");
        String minus = st.nextToken();
        int ret = plus(minus);
        while (st.hasMoreTokens()){
            ret -= plus(st.nextToken());
        }
        return ret;
    }

}
