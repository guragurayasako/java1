/*A: Creating Objects [1 pt]

Your task is to create the Point class. The Point class has x-coordinate and y-coordinate values as fields and
has methods to set and get them respectively.
Test the Point class with the PointCreationApplication class shown below.

import java.util.Scanner;
class PointCreationApplication{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 Point p1 = new Point();
 Point p2 = new Point();
 p1.setX(sc.nextInt());
 p1.setY(sc.nextInt());
 p2.setX(sc.nextInt());
 p2.setY(sc.nextInt());
 System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
 System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
 }
}

If PointCreationApplication produces the corresponding output for the following sample inputs, it can be
judged that the Point class has been implemented correctly.

Sample Input 	Sample Output
1 2				(1, 2)
3 4				(3, 4)*/


import java.util.Scanner;

class PointCreationApplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		
		Point p1 = new Point();
		Point p2 = new Point();

		p1.setX(sc.nextInt());
		p1.setY(sc.nextInt());
		p2.setX(sc.nextInt());
		p2.setY(sc.nextInt());

		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
	}
}
