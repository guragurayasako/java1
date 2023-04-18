/*D: Prime Factorize [2 pt]

Write a program to factorize a given integer 𝑛.
For the input, an integer 𝑛 is given in a line.
For the output, print the given integer 𝑛 and ’:’. Then, print prime factors in ascending order. If 𝑛 is
divisible by a prime factor several times, the prime factor should be printed according to the number of
times. Print a space before each prime factor.
Please check your solution by the following sample input and the corresponding output:

Sample 					Input Sample Output
12 12: 					2 2 3
126 126: 				2 3 3 7
1234567890 1234567890: 	2 3 3 5 3607 3803
1000000000 1000000000: 	2 2 2 2 2 2 2 2 2 5 5 5 5 5 5 5 5 5
*/

import java.util.Scanner;

class PrimeFactorizer{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		//出力
		System.out.print(n+": ");
		for(int i = 2; i<=n; i++){
			while(n%i == 0){
				n /= i;
				if(n == 1)System.out.println(i);
				else System.out.print(i + " ");
			}
		}
	}
}
