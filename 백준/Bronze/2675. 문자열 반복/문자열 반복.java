import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < count; i++) {
            int R = scanner.nextInt();
            String str = scanner.next();
            for (int k = 0; k < str.length(); k++) {
                for(int j=0; j<R; j++) {
                    sb.append(str.charAt(k));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}