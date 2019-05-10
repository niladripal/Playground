import java.util.Scanner;
//import java.lang.Math.*; //for Math.PI
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a choice between 1 to 4 to get the area of a Shape\n1. Square 2. Rectangle 3. Triangle 4. Circle:");
		//System.out.println("---------------------------------------------------------");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				//System.out.println("Enter the side of the Square:");
				int side = sc.nextInt();
				int square_area = side * side;
				//System.out.println("The area of Square is: ");
				System.out.println(square_area);
				break;
			case 2:
				//System.out.println("Enter the length of the Rectangle:");
				int length = sc.nextInt();
				//System.out.println("Enter the breadth of the Rectangle:");
				int breadth = sc.nextInt();
				int rectangle_area = length * breadth;
				//System.out.println("The area of Rectangle is: ");
				System.out.println(rectangle_area);
				break;
			case 3:
				//System.out.println("Enter the base of the Triangle:");
				int base = sc.nextInt();
				//System.out.println("Enter the height of the Triangle:");
				int height = sc.nextInt();
				int triangle_area = (base * height)/2;
				//System.out.println("The area of Triangle is: ");
				System.out.println(triangle_area);
				break;
			case 4:
				//for accurate result
				//System.out.println("Enter the radius of the Circle: ");
				//double radius = sc.nextDouble();
				//double circle_area = Math.PI * radius * radius);
				//System.out.println("The area of Circle is: ");
				//System.out.printf("%.14f",circle_area);
				
				//for required output of test case
				//System.out.println("Enter the radius of the Circle:");
				int radius = sc.nextInt();
				//System.out.println("The area of Circle is: ");
				System.out.println(3.14*radius*radius);
				break;
			default:
				System.out.println("Invalid!!! Please enter a number between 1 to 4!!");
			
		}
	}
}