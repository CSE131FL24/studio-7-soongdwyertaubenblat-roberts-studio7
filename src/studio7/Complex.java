package studio7;

public class Complex {

	private double a;
	private double b;
	
	public Complex (double a, double b) {
		this.a = a;
		this.b =b;
		
	}
	
	public double[] addition(double a1,double b1,double a2,double b2) {
		double new_a = a1+a2;
		double new_b = b1+b2;
		
		double [] new_ab = {new_a, new_b};
		
		System.out.println(new_ab[0] + "+" + new_ab[1] + "i");
		
		return new_ab;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complex complex1 = new Complex(2,4);
		Complex complex2 = new Complex(4,2);
		complex1.addition(2,4,4,2);
		
		
	}

}
