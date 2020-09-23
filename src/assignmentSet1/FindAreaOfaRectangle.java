package assignmentSet1;
import java.util.Scanner; //Scanner class import


public class FindAreaOfaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float len,breadth, area,perimeter,sum;
		System.out.println("Enter the length of the Rectangle");
		Scanner s= new Scanner(System.in);
		len =s.nextFloat();
		System.out.println("Enter the breath of the Rectangle");
		breadth =s.nextFloat();
		area = len*breadth;
		perimeter = 2 * (len + breadth);
		System.out.println("Area of the Rectangle is "+area);
		System.out.println("Perimeter of the Rectangle is"+perimeter);
		

	}

}
