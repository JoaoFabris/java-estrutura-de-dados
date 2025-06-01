
//Desenvolva um programa de Jogo da Velha (Tic-Tac-Toe) para uma brincadeira entre amigos. 
//Utilize uma matriz para representar o tabuleiro e permita que dois jogadores façam jogadas alternadas, verificando quem será o vencedor!
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';

            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter a row:");
            int row = scanner.nextInt();
            System.out.println("Player " + player + " enter a col:");
            int col = scanner.nextInt();
            System.out.println();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid coordinates! Row and column must be between 0 and 2.");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    break;
                } else {
                    if (player == 'X') { // if, after the player enters a number, player is 'X', switch to 'O'
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Cell already taken. Try again.");
                continue;
            }
        }
        scanner.close();
    }

    public static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true; // Check rows
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true; // Check columns
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check diagonal from top-left to bottom-right
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Check diagonal from top-right to bottom-left
        }
        return false; // No win condition met
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}