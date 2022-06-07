import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String nm[] = input.readLine().split(" ");       
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        boolean prime[] = new boolean[m+1];
        
        for(int i=2; i<=m; i++) {
        	if(prime[i]) continue;
        	
        	if(i >= n) sb.append(i+"\n");
        	
        	for(int j=i+i; j<=m; j+=i) {
        		prime[j] = true;
        	}
        }
        
        System.out.println(sb);
    }
}