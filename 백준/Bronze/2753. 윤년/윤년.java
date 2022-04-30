import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int A = scanner.nextInt();
      int leap = 0;
      if(A%100 == 0 && A%400!=0)
        leap = 0;
        else if(A%4==0)
        leap = 1;
      System.out.println(leap);
    }
}