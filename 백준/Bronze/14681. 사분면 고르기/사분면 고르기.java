import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int X = scanner.nextInt();
      int Y = scanner.nextInt();
      int quarter = 0;
      if( X > 0 && Y > 0) quarter = 1;
      else if( X < 0 && Y >0) quarter = 2;
      else if( X < 0 && Y < 0) quarter = 3;
      else if( X > 0 && Y < 0) quarter = 4;
      System.out.println(quarter);
    }
}