
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
         //play while hangman.gameOn
        //when user write "quit"  exit of the game
        //when user dont write anything print the menu
        //when user write a single letter use hangman.guess
        //when user write "status" use hangman.printSatus
        //BEGIN SOLUTION
        while (hangman.gameOn()){
            String command = reader.nextLine();
            if(command.equals("quit")){
                break;
            }
            if(command.equals("status")){
                hangman.printStatus();
            }
            
            if(command.length() == 1) {
                hangman.guess(command);
            }
            
            if(command.isEmpty()) {
                printMenu();
            }
            
            hangman.printMan();
            hangman.printWord();
        }

        System.out.println("Thank you for playing!");
        //END SOLUTION
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
