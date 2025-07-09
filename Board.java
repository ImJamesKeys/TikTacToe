package tiktactoe;

public class Board {

	public Board() {
		
	}

	public void printBoard(int[] placement){
		// Three rows in Tic Tac Toe
		for (int row=0;row<3;row++) {
			// Four layers to create one row
			for(int create=0;create<4;create++) {
				System.out.print("| ");
				//Used to determine what token is in each column
				for(int figure=0; figure<3;figure++) {
					
					if (placement[figure+row*3]==0) {
						System.out.print("    ");
					}
					else if (placement[figure+row*3]==1) {
						createX(create);
					} 
					else if (placement[figure+row*3]==4) {
						createO(create);
					}
					System.out.print(" | ");				
				}
				
				System.out.println();

			}
			if (row!=2) {
				System.out.println("----------------------");

			}
			else
				System.out.println("");
		}	
	}
	// createX and createO holds the layers of X and O to be generated like a old tv line by line
	private void createX(int create) {

		if(create==0) {
			System.out.print("    ");
		}
		else if(create==1) {
			System.out.print(" \\/ ");
		}
		else if(create==2) {
			System.out.print(" /\\ ");
		}
		else if(create==3) {
			System.out.print("    ");
		}


	}
	private void createO(int create) {
		// TODO Auto-generated method stub
		if(create==0) {
			System.out.print(" __ ");
		}
		else if(create==1) {
			System.out.print("|  |");
		}
		else if(create==2) {
			System.out.print("|__|");
		}
		else if(create==3) {
			System.out.print("    ");
		}


	}

}
/* desired result
|      |  __  |      |
|  \/  | |  | |      |
|  /\  | |__| |      |
|      |      |      |
----------------------

*/