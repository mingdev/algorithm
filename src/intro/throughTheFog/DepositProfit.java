package intro.throughTheFog;

public class DepositProfit {
  public static int depositProfit(int deposit, int rate, int threshold) {
    int count=0;
    double result = deposit;

    while(result<threshold){
      result = result + result * (double)rate/100;
      count++;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(depositProfit(20,10,50));
  }
}
