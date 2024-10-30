package studio7;

public class Die {

	private int sides;
	
	public Die (int sides) {
		this.sides =sides;
		
	}
	
	public int rand() {
		
		int throwvalue = (int) (Math.random() *sides) +1;
		return throwvalue;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Die die1 =new Die(6);
System.out.println(die1.rand());

		
	}

}
