public class ThingTest{
	public static void main(String[] args){
		
		Thing a = new Thing(2,"First");
		Thing b = a;
		b.setName("Changed Both??");
		
		System.out.println("a name: "+a.name);
		System.out.println("b name: "+b.name);

	}
}


class Thing {
	int num;
	String name;

	public Thing(int num,String name){
		this.num = num;
		this.name = name;
	}

	public void setNumber(int num){
		this.num = num;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getNumber(){
		return num;
	}

	public String getName(){
		return name;
	}
}