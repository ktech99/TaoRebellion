import java.util.Scanner;

// calculating Tao using Madhava–Leibniz series
// Larger the number more accurate is the calculation
// Made as a rebellion against pi on pi day
public class TaoCalculator {
  public static void main(String args[]) {
    System.out.println("enter the number of terms you want to calculate tao till :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Double tao = 0.0;
    for (int i = 0; i < num; i++) {
      tao += ((Math.pow(-1, (i))) / (2 * i + 1));
    }
    tao *= 8;
    System.out.println(tao);
  }
}
