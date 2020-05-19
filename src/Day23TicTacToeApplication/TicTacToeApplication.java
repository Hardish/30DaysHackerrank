package Day23TicTacToeApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    run game tictactoe
 */
public class TicTacToeApplication {

    public static void main(String[] args) {

        //getting input
        Scanner scanner = new Scanner(System.in);

        //Allows for cont. games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            //Setting up Token for user and AI
            System.out.println("Welcome to Tic Tac Toe! You are about to go against "
            +"the master of Tic Tac Toe. Are you ready ? I hope so! \n" +
                    "But FIRST, you must pick what character you want to be " +
                    "and which character i will be");

            System.out.println();
            System.out.println("Enter a single Character that will represent" +
                    " you on the board");
            char playerToken  = scanner.next().charAt(0);
            System.out.println("Enter a single Character that will represent" +
                    " you opponent on the board");
            char opponentToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken,opponentToken);
            AI ai = new AI();

            //set up the game
            System.out.println();
            System.out.println("Now we can start the game. To Play, enter a " +
                    "number and your token shall be put in its place." +
                    "\nThe number go from 1-9, left to right." +
                    "We shall see who will win this round");
            TicTacToe.printIndexBoard();
            System.out.println();

            //Let's play
            while(game.gameOver().equals("Not Over.")) {
                if(game.currentMarker == game.userMarker) {
                    //USER Turn
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scanner.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again. " + spot + "is invalid. This spot is already taken or" +
                                "it is out of the range");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked "+spot + "!");
                } else {
                    //AI turn
                    System.out.println("It's my turn");
                    //Pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked "+aiSpot + "!");
                }

                //print out new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            //Set up a new game? or not depending on the response.
            System.out.println("Do you want to play again? Enter Y if you do. " +
                    "Enter anything else if you are tired of me.");
            char response = scanner.next().charAt(0);
            doYouWantToPlay = (response == 'Y' || response == 'y');
            System.out.println();
            System.out.println();
        }
    }
}
