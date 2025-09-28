import java.util.*;

public class TestSetup {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String prompt = "Enter a number: ";

       int input = getIntegerInput(scnr, prompt);
       System.out.println("You entered: " + input);


    }

    private static int getIntegerInput(Scanner scnr, String prompt) {
          while(true) {
               System.out.print(prompt);

               String input = scnr.nextLine();
               try{
                    int result = Integer.valueOf(input.trim());

                    return result;
               } catch(NumberFormatException e) {
                    System.out.println("Invalid Input. Please enter valid integer.");
               }
               
          }
    }
     
}