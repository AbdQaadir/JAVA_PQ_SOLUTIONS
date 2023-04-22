import java.util.Scanner;

public class StudentType{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your studentship type: ('U' or 'P'): ");
    
    String status = input.nextLine();
    
    
    // Output variable
    String output = "";
    
    // IF STATEMENT
    if(status.equals("U")){
      output = "UNDERGRADUATE";
    }else if(status.equals("P")){
      output = "POSTGRADUATE";
    }else {
      output = "INVALID STUDENT TYPE";
    }
    
    // SWITCH STATEMENT
    switch(status){
      case "U":
        output = "UNDERGRADUATE";
        break;
      case "P":
        output = "POSTGRADUATE";
        break;
      default:
        output = "INVALID STUDENT TYPE";
    }
  
    System.out.println(output);
      
        
  }

}
