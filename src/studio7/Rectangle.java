package studio7;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle (int length, int width) {
		
		this.length=length;
		this.width=width;
	
		
	}
	
	public int area () {
		int area = this.length*this.width;
		return area;	
		
	}
	
	public int perimeter () {
		int perimeter = 2*this.length + 2*this.width;
		return perimeter;	
	}
	
	public boolean ifsquare () {
		if (length == width) {
			return true;
			
		}
		return false;
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(2,4);
		System.out.println(rectangle1.area());
		System.out.println(rectangle1.perimeter());
		System.out.println(rectangle1.ifsquare());
		
		Rectangle rectangle2 = new Rectangle(4,4);
		System.out.println(rectangle2.area());
		System.out.println(rectangle2.perimeter());
		System.out.println(rectangle2.ifsquare());



		
	}

}
