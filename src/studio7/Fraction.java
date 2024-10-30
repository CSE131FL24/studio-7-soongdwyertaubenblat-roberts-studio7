package studio7;

public class Fraction {

		private double denominator;
		private double numerator;
		private double fractionvalue;
		
		
		public Fraction (double numerator, double denominator) {
			
			this.denominator=denominator;
			this.numerator=numerator;
			this.fractionvalue = numerator/denominator;
		}
		
		public double getFractionValue () {
			return this.numerator/this.denominator;
		}
		
		public double sum(Fraction f1, Fraction f2) {
			
			double sum = f1.getFractionValue() + f2.getFractionValue();
			return sum;
			
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction (1,5);
		Fraction f2 = new Fraction (1,2);
		System.out.println(f1.sum(f1,f2));

	}

}
