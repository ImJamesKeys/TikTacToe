package tiktactoe;
import java.util.Scanner;


public class Gameplay {
	private int round;
	private int[] placement;
	private int[] check;
	private Board letsPlay =new Board();
	private Scanner input=new Scanner(System.in);

	public Gameplay() {
		System.out.println("Welcome To Tic Tac Toe by James Keys");

	}
	// restart the game
	public void gameStart() {
		round=0;
		placement=new int[9];
		check=new int[8];
		nextRound();
	}
	// main component for user response 
	public void nextRound() {
		int position;
		int winner=0;
		letsPlay.printBoard(placement);
		// display options
		System.out.println("|0|1|2|\n-------\n|3|4|5|\n-------\n|6|7|8|");
		
		//create input boundary
		System.out.print("Choose your position: ");
		position=input.nextInt();
		if (position>8||position<0) {
			System.out.println("That Not a Spot Go Again!");
			nextRound();
		}
		//checks if input is available 	
		if(placement[position]==0) {
			if(round%2==0) {
				placement[position]=1;
				winner=checkWinner(position,1);

			}
			else {
				placement[position]=4;
				winner=checkWinner(position,4);

			}
			round++;
		}
		else {
			if(round%2==0)
				System.out.println("That Spot is Taken X Go Again!");
			else
				System.out.println("That Spot is Taken O Go Again!");
			nextRound();
		}
		
		if (winner==0)
			nextRound();
		else {
			// restarts the game
			System.out.println("Would You Like To Play Again? Yes/No -> 1/0");
			int newGame=input.nextInt();
			if(newGame==1) {
				gameStart();
			}
			else
				System.out.println("Thanks For Playing");
		}
		
		
	}
	// There's Eight ways of winning by adding by 1 for X and 4 for O
	// if it Equals 3 for X or 12 for O means they win
	private int checkWinner(int position, int which) {
		// TODO Auto-generated method stub
			if(position==0) {
				check[0]+=which;
				check[3]+=which;
				check[6]+=which;
			}
			else if(position==1) {
				check[1]+=which;
				check[3]+=which;
			}
			else if(position==2) {
				check[2]+=which;
				check[3]+=which;
				check[7]+=which;
			}
			else if(position==3) {
				check[0]+=which;
				check[4]+=which;
			}
			else if(position==4) {
				check[1]+=which;
				check[4]+=which;
				check[6]+=which;
				check[7]+=which;

			}
			else if(position==5) {
				check[2]+=which;
				check[4]+=which;
			}
			else if(position==6) {
				check[0]+=which;
				check[5]+=which;
				check[7]+=which;
			}
			else if(position==7) {
				check[1]+=which;
				check[5]+=which;
			}	
			else if(position==8) {
				check[2]+=which;
				check[5]+=which;
				check[6]+=which;
					
			}	
			//Check if there is a winner, or tie meaning no more spaces and no winner
			for(int j=0;j<8;j++) {
				if (check[j]==3) {
					letsPlay.printBoard(placement);
					System.out.println("Congrates X Wins");
					return 1;
				}
				if (check[j]==12) {
					letsPlay.printBoard(placement);
					System.out.println("Congrates O Wins");
					return 1;
				}
			}
			if(round==8) {
				letsPlay.printBoard(placement);
				System.out.println("It's A Tie");
				return 1;
			}
			return 0;
	}
}
