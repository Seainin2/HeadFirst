public class BottleSong{
	public static void main(String[] args){
		int bottles = 10;
		while(bottles>0){
			System.out.println(bottles+" bottles of beer on the wall, "+bottles+" bottles of beer");
			bottles = bottles - 1;
			System.out.println("You take one down, you pass it around, "+bottles+" bottles of beer left on the wall");
		}
	}
}