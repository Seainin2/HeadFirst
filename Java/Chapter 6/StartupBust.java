import java.util.ArrayList;

public class StartupBust{
	private GameHelper helper = new GameHelper();
	private ArrayList<Startup> startups = new ArrayList<Startup>();
	private int numOfGuesses = 0;

	public void setUpGame(){
		Startup one = new Startup();
		one.setName("poniez");
		Startup two = new Startup();
		two.setName("hacqi");
		Startup three = new Startup();
		three.setName("cabista");
		startups.add(one);
		startups.add(two);
		startups.add(three);

		System.out.println("Your goal is to sink three Startups.");
		System.out.println("poniez, hacqi, cabista");
		System.out.println("Try to sink them all in the fewest number of guesses");

		for (Startup current : startups){
			ArrayList<String> newCells = helper.placeStartup(3);
			current.setLocationCells(newCells);
		}
	}

	public void startPlaying(){
		while(!startups.isEmpty()){
			String guess = helper.getUserInput("Enter a guess");
			checkUserGuess(guess);
		}		
		finishGame();
	}

	public void checkUserGuess(String guess){
		numOfGuesses++;
		String result = "miss";

		for(Startup current : startups){
			result = current.checkYourself(guess);

			if(result == "hit"){
				break;
			}

			if(result == "kill"){
				startups.remove(current);
				break;
			}
		}

		System.out.println(result);
	}

	public void finishGame(){
		System.out.println("All Startups are dead! Your stock is now worthless");
		if(numOfGuesses<=18){
			System.out.println("It only too you "+numOfGuesses+" guesses.");
			System.out.println("Congrats, You won");
		} else{
			System.out.println("Took you long enough. "+numOfGuesses+" guesses.");
			System.out.println("At least you got there in the end");
		}
	}

	public static void main(String[] args){
		StartupBust game = new StartupBust();
		game.setUpGame();
		game.startPlaying();
	}

}