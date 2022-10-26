import java.util.Scanner;

public class Main {
    private static Board board;
    private static Boolean turn;
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        board = new Board();
        System.out.println(board);
        turn = false;
        while(!board.goalTest(Board.X) && !board.goalTest(Board.O)){
            if (turn) {
                System.out.println("X player enter row, column coordinates: ");
                Scanner xScanner = new Scanner(System.in);
                String[] nums = xScanner.nextLine().split("\\s+");
                int row = Integer.parseInt(nums[0]);
                int column = Integer.parseInt(nums[1]);
                board.setSpot(row, column, turn);
                turn = false;
                System.out.println(board);
            }
            else{
                System.out.println("O player enter row, column coordinates: ");
                Scanner oScanner = new Scanner(System.in);
                String[] nums = oScanner.nextLine().split("\\s+");
                int row = Integer.parseInt(nums[0]);
                int column = Integer.parseInt(nums[1]);
                board.setSpot(row, column, turn);
                turn = true;
                System.out.println(board);
            }
        }
    }
}