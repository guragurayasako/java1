/*B: Manipulating Objects [1 pt]

Your task is to extend the Point class by adding the move method. The move method takes two integers 𝑑𝑥
and 𝑑𝑦 and moves the x-coordinate value of the point by 𝑑𝑥 and the y-coordinate value by 𝑑𝑦.
Test the Point class with the PointMovingApplication class shown below. Note that the initial position of
the point is the origin (0, 0).

import java.util.Scanner;
class PointMovingApplication{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 Point pt = new Point();
 int Q = sc.nextInt();
 for ( int i = 0; i < Q; i++ ){
 int dx = sc.nextInt();
 int dy = sc.nextInt();
 pt.move(dx, dy);
 }
 System.out.println("(" + pt.getX() + ", " + pt.getY() + ")");
 }
}

If PointMovingApplication produces the corresponding output for the following sample inputs, it can be
judged that the Point class has been implemented correctly.

Sample Input 	Sample Output
5				(25, 30)
1 2
3 4
5 6
7 8
9 10*/
import java.util.Scanner;

class PointMovingApplication{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	Point pt = new Point();

	int Q = sc.nextInt();
	for( int i = 0; i < Q; i++ ){
	    int dx = sc.nextInt();
	    int dy = sc.nextInt();
	    pt.move(dx, dy);
	}

	System.out.println("(" + pt.getX() + ", " + pt.getY() + ")");
    }
}
