import java.io.*;
import java.util.*;

public class NSWC_Citizen {


  public static void main(String[] args){
    int numOfCitizens;
    int totalAllowances = 0;
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many citizens? ");
    numOfCitizens = input.nextInt();
    
    String[] citizensStatus = new String[numOfCitizens];
    
    for(int i = 0; i < numOfCitizens; i++){
      System.out.println("Enter marital status for citizen #" + i + ":");
      citizensStatus[i] = input.nextLine();
    }
    
    
    for(int i = 0; i < numOfCitizens; i++){
      System.out.println("Enter marital status for citizen #" + i + ":");
      
      int allowance = calculateAllowance(citizensStatus[i]);
      System.out.println("NSWC allowance for citizen #" + i + " of marital status " + citizensStatus[i] + " is N" + allowance);
      
      
      totalAllowances += allowance;
    }
    
    
    
    System.out.println(Arrays.toString(citizensStatus));
    
  }

  private static int calculateAllowance(String status){
    int allowance;
    switch(status){
      case "Single":
        allowance = 500;
        break;
      case "Married":
        allowance = 2000;
        break;
      case "Seperated":
        allowance = 3000;
        break;
      case "Divorced":
        allowance = 4000;
        break;
      default:
        allowance = 0;
    }
    
    return allowance;
  }
}
