import java.util.*;

// 1. Accept name and Salaries of 20 academic staff
// 2. Display a list containing name, salaries and the rank.
// 3. Display the total and the average salary.
// Professor N3000 - N5000
// Associate Professor N2500 - N2999
// Senior Lecturer N2000 - N2499
// Lecturer N1000 - N1999

public class AcademicStaff {
  
  public static void main (String[] args) {
    int staffCount = 5;
    String[] staffNames = new String[staffCount];
    int[] staffSalaries = new int[staffCount];
    
    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i < staffCount; i++){
      System.out.println("Enter name for staff #" + (i+1));
      String name = input.nextLine();
      staffNames[i] = name;
      
      System.out.println("Enter salary for staff #" + (i+1));
      int salary = input.nextInt(); // 1000 + (500 * i); 
      staffSalaries[i] = salary;
    }
    
    for (int i = 0; i < staffCount; i++){
      String staffName = staffNames[i];
      int staffSalary = staffSalaries[i];
      String staffRank = getStaffRank(staffSalary);
      
      System.out.println(staffName + " - N" + staffSalary + " - " + staffRank);
    }
    
    int totalSalary = calculateTotal(staffSalaries);
    int averageSalary = calculateAverage(totalSalary, staffCount);
    
    System.out.println("Average Salary: N" + averageSalary);
    System.out.println("Total Salary: N" + totalSalary);
    
  }

  
  static int calculateTotal(int[] staffSalaries){
    int total = 0;
    for (int i = 0; i < staffSalaries.length; i++) {
      total += staffSalaries[i];
    }
    
    return total;
  }
  
  static int calculateAverage(int total, int staffCount){
    int average = total / staffCount;
    
    return average;
  }
  
  
  static String getStaffRank(int salary){
    String rank = "";
    
    if(salary >= 1000 && salary <= 1999){
      rank = "Lecturer";
    }
    else if(salary >= 2000 && salary <= 2499){
      rank = "Senior Lecturer";
    }
    else if(salary >= 2500 && salary <= 2999){
      rank = "Associate Professor";
    }
    else if(salary >= 3000 && salary <= 5000){
      rank = "Professor";
    }
    
    return rank;
  }
}
