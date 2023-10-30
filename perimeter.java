import java.util.Scanner;

class Rectangle {
    int length,breadth,perimeter;

    void rectangle() 
    {
        length = 1;
        breadth = 2;
        perimeter = 2*(length+breadth);
        System.out.print(perimeter);
    }

    void rectangle(int l,int b)
     {
        length = l;
        breadth = b;
        int perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }

    
}

public class perimeter {
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	int l,b;
	System.out.println("the length and breadth of racftangle1: (default values) 1 , 2");
	System.out.println("enter the length and breadth of racftangle2");
	l= sc.nextInt();
	b= sc.nextInt();
	Rectangle obj1 = new Rectangle();
	Rectangle obj2 = new Rectangle();
	System.out.print("perimeters of rectangle 1 and rectangle 2 are: ");
	obj1.rectangle();
	obj2.rectangle(l,b);
        }
}
