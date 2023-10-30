import java.util.*;
class Area{
	void find_area(int radius){
		double area = 3.14 * radius * radius;
		System.out.println("Area of the circle is " + area);
		}
	void find_area(int len, int br){
		int area = len * br;
		System.out.println("Area if the rectangle is " + area);
		}
	void find_area(int height, int base, int x){
		double area = base * height * 0.5;
		System.out.println("Area of the triangle is " + area);
		}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Area ob = new Area();
		System.out.println("Enter radius: ");
		int radius = scan.nextInt();
		System.out.println("Enter length: ");
		int length = scan.nextInt();
		System.out.println("Enter breadth: ");
		int breadth = scan.nextInt();
		System.out.println("Enter base: ");
		int base = scan.nextInt();
		System.out.println("Enter height: ");
		int height = scan.nextInt();
		ob.find_area(radius);
		ob.find_area(length, breadth);
		ob.find_area(height, base, 0);
		}	
	}
