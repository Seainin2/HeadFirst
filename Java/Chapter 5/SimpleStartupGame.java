import java.util.Scanner;

public class SimpleStartupGame{

	public static void main(String[] args){

		SimpleStartup game = new SimpleStartup();
		GameHelper helper = new GameHelper();

		int numOfGuess = 0;

		int position = (int)(Math.random() * 5);
		int[] positions = {position,position+1,position+2};
		game.setLocationCells(positions);

		while(true){
			int guess = helper.getUserInput("enter a number");
			String result = game.checkYourself(guess);
			numOfGuess++;

			if(result.equals("kill")){
				System.out.println("Congrats, you sank the startup, you took "+numOfGuess+" guesses");
				break;
			}

		}
		

	}

}