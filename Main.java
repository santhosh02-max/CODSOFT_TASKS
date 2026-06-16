import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
     Scanner sc = new Scanner(System.in);
     Random random = new Random();
     
     int score = 0;
    String playAgain;
    
    do{
        int number = random.nextInt(100) + 1;
        int attempts = 5;
        boolean guessed = false;
        System.out.println("\n====NUMBER GAME====");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have" + attempts + " attempts.");
        while (attempts > 0){
            System.out.print("Enter your guess:");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Correct! You guessed the number!");
                score++;
                guessed = true;
                break;
            } else if ( guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too low!");
            } 
            
            attempts--;
            System.out.println("Attempts left:" + attempts);
        }
        
        if(!guessed) {
            System.out.println("Game over!");
            System.out.println("The correct number was:" + number);
            }
            System.out.println("Current score:" + score);
            System.out.print("play again? ( yes/no):");
            playAgain = sc.next();
    } while
    (playAgain.equalsIgnoreCase("yes"));
          System.out.println("\nFinal Score:" + score);
          System.out.println("Thankyou for playing!");
          sc.close();
    }
                           }
