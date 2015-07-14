import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number: ");
		System.out.println(pFactor(in.nextInt()));
		in.close();
	}
	
	public static String pFactor(int n)
	{
		if (numDiv(n)==0) //recursive function runs until n is prime and thus the end of the prime factorization
			return n + "";
		for (int i = 2; i < n; i++) //to get all prime factors up to number n
		{
			if (numDiv(i)==0 && n%i==0) 		 //tests if current number is prime and is a factor of n
				return (i + "*") + pFactor(n/i); //reduces n to find more prime factors
		}
		
		return null;
	}
	public static int numDiv(int n) //prime number tester
	{								
		int count = 0;
		for (int i = 2; i < n; i++)
		{
			if (n%i==0)
				count++;
		}
		return count;
	}
}
