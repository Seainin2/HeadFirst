import java.util.ArrayList;

public class SimpleStartup{
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> cells){
		this.locationCells = cells;
	}

	public String checkYourself(String guess){

		String reply = "miss";

		int index = locationCells.indexOf(guess);

		if(index>=0){
			locationCells.remove(index);
		}

		if(locationCells.isEmpty()){
			result = "kill";
		} else{
			result="hit";
		}
	return results;

	}
}