import java.util.Scanner;

public class MoneyBreakdown {

  public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter amount as a whole: ");
      int amount = input.nextInt();
      int[] denominations = {100, 50, 20, 10, 5};
      int[] result = new int[denominations.length];
      
      while(amount % 5 != 0){
        System.out.print("Enter amount as a whole (divisble by 5 or 10): ");
        amount = input.nextInt();
      }
      
      int tempAmount = amount;
      
      for(int i = 0; i < denominations.length; i++){
        result[i] = amount / denominations[i];
        
        amount = amount % denominations[i];
        
        if(amount < denominations[denominations.length - 1]) break;
        
      }
      
      System.out.println("amount " + amount);
      
      for(int k = 0; k < result.length; k++){
        System.out.println("N" + tempAmount + " has " + result[k] + " N" + denominations[k] + " denomination note(s).");
      }
      
      
  }

}
