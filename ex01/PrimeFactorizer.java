import java.util.Scanner;

class PrimeFactorizer{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long int n = sc.nextInt();
	
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
