// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

// 1. Accept the beneficiary count +++
// 2. Collect the marital status of each beneficiary 
//    "Single" - 500, "Married" - 2000, "Seperated" - 3000, "Divorced" - 4000.
// 3. Compute allowance for each beneficiary
// 4. Display individual allowance with their status
// 5. Display the total allowances paid.

public class NSWCAllowance {
  
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Accept beneficiary count
    System.out.println("Enter beneficiary count: ");
    int beneficiaryCount = input.nextInt();
    int totalAllowances = 0;
    
  
    // TODO: Validate beneficiary count
    while(beneficiaryCount < 1){
      System.out.println("Enter beneficiary count (greater than zero): ");
      beneficiaryCount = input.nextInt();
    }
    
    // Collect and Store beneficiaries' marital status
    String[] citizensMaritalStatus = new String[beneficiaryCount];
    int[] citizensAllowances = new int[beneficiaryCount];
    
    for(int i = 0; i < beneficiaryCount; i++){
      System.out.println("Enter the marital status of citizen #" + (i+1));
      String maritalStatus = input.nextLine();
  
      int citizenAllowance = calculateAllowance(maritalStatus);
      
      // Update the total allowances
      totalAllowances += citizenAllowance;

      citizensMaritalStatus[i] = maritalStatus;
      citizensAllowances[i] = citizenAllowance;
    }
    
    for(int i = 0; i < beneficiaryCount; i++){
      System.out.println("Citizen #" + (i+1) + " of " + citizensMaritalStatus[i] + " marital status is awarded N" + citizensAllowances[i] + ".");
    }
    
    System.out.println("Total allowances paid is N" + totalAllowances);
    
  }
  
  static int calculateAllowance(String status){
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
