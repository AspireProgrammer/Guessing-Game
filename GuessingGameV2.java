
/**
 * Program a number guessing game
 *
 * @Rebekah Shi
 * @1/9/2020
 */
import java.util.Scanner;
public class GuessingGameV2
{
   public static void main(String[]args)
   {
       int counter = 1;
       double random = 0.0;
       int number = 0;
       
       
       Scanner in = new Scanner(System.in);
       System.out.println("Hello there! Please enter the lowest value of your range.");
       int lowest = in.nextInt();
       
       System.out.println("Please enter the highest value of your range.");
       int highest = in.nextInt();
       
       System.out.println("I am thinking of a number between "+ lowest + " and " + highest + ". Can you guess the number?");
       
       random = ((int)(Math.random()*(highest-lowest) + lowest));
       
       while(number != random)
       { 
         number = in.nextInt();
         System.out.print("Try # " + counter + "\t");
         if(number < random)
           {
           System.out.println("Not quite, your number is too low. Try again!");
           
        }
        else if(number > random)
        {
            System.out.println("Nice try, your number is too high. Try again!");
        }
        else
        {
            System.out.println("You got it!");
        }
       counter++;
    }
    System.out.println();
    System.out.println("The random number was " + random);
    System.out.println("It took you " +counter + " tries.");
    
    
      
    }
}
