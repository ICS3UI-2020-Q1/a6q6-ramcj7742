import java.util.Scanner;
/**
 * prints the users numbe requivalent in fibanacchi sequence
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number form user
    System.out.println("What Fibonacci number would you like to find");
    int userNum = input.nextInt();

    //create array that will store all of the numbers up to usernumber
    int array[] = new int[userNum + 1];

    //gets all numbers into array
    for(int i = 0; i < array.length; i++){
      array[i] = i;
    }

    //creates variable for user fibonacci number
    int fibonacci = 0;

    //calculates fibonacci number
    for(int i = 0; i < userNum; i++){
      fibonacci = array[i] + array[i + 1];
    }

    //displays fibonacci number to user
    System.out.println("The " + userNum + " Fibonacci number is " + fibonacci);
  }
}
