/*C: Fahrenheit to Celsius Converter [2 pt]

The Fahrenheit scale is the primary temperature standard in the USA. Please write a program
converting Fahrenheit to the Celsius scale. The formula is as follows:
Celsius = (5 / 9) * ( Fahrenheit - 32 )

You can use the following template:
import java.util.Scanner; // API to use the Scanner object
class Fahrenheit{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in); // A reference to a Scanner object
 int F = sc.nextInt(); // read an integer from the std. input
 // you code

 }
}

To display the value of a variable, pass the variable to the println method as a argument. Here is an
example.

double id = 3.14;
System.out.println(id);

Please check your solution by the following sample input and the corresponding output:

Sample 	Input Sample Output
77 		25.0
80 		26.6667
91 		32.7778
108 	42.2222
*/

import java.util.Scanner;

class Fahrenheit{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int F = sc.nextInt();
	double C = (5.0/9.0)*(F - 32);
	System.out.println(C);
	}
}
