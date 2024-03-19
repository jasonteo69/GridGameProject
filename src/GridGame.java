import java.util.Scanner;

public class GridGame {
    private Space[][] board;
    private Player player;
    private Scanner scanner;

    public GridGame() {
        scanner = new Scanner(System.in);
        createPlayer();
        setupBoard();
        play();
    }

    private void createPlayer() {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);
    }

    // initialize the board instance variable to be a 8x8 board;
    // place new Space object with "_" as the symbol into each board position;
    // place the Player object at lower left corner;
    // initialize and place a Goal object with the symbol "X" in the upper right corner;
    // create several Treasure objects (up to you how many), with symbol of your choice,
    // each with a point value that you decide, and place them throughout the board
    private void setupBoard() {
        board = new Space[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int f = 0; f < board[0].length; f++) {
                board[i][f] = new Space("_");
            }
        }
        Goal goal = new Goal("X");
        board[0][board.length - 1] = goal;

    }

    /* prints the 2D array board, showing the symbol for each Space, e.g.
       _______X
       __#_____
       _____#__
       _#______
       ________
       ______#_
       ________
       M___#___
     */
    private void printBoard() {
        for (Space[] spaces : board) {
            for (Space space : spaces) {
                System.out.print(space.toString());
            }
            System.out.println();
        }


    }

    // plays the game;
    private void play() {

        // WRITE THIS METHOD
        // main game loop:
        // while the player has not yet reached the goal, print the board (complete can call helper method below)
        // then asks user to enter a direction: W, A, S, D (up, left, down, right).
        // if the intended direction is in bounds, move the Player to the new location and fill previous position
        // with a Space object (with "_" symbol).
        // if player moves to a position occupied by a Treasure, add its point value to the players score,
        // and replace that element with a Space object (with "_" symbol).
        // if the player reaches the goal, end the game and print their final score and the number of moves it took
        while (!player.getSymbol().equals("X")) {
            printBoard();
            System.out.println("Enter a direction: W, A, S, D (up, left, down, right)");
            String choice = scanner.nextLine();
            if (choice.equals("W") && ) {

            }
        }


    }
}