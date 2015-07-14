import java.util.Scanner;

public class P3 {
	static String[][] n1 = {{" "," ", "1", " "," "},
						   	{" "," ", "1", " "," "},
						   	{" "," ", "1", " "," "},
						   	{" "," ", "1", " "," "},
						   	{" "," ", "1", " "," "}};
	static String[][] n2 = {{" ","2", "2", " "," "},
		   					{"2"," ", " ", "2"," "},
		   					{" "," ", "2", " "," "},
		   					{" ","2", " ", " "," "},
		   					{"2","2", "2", "2","2"}};
	static String[][] n3 = {{"3","3", "3", "3","3"},
							{" "," ", " ", " ","3"},
							{" "," ", "3", "3"," "},
							{" "," ", " ", " ","3"},
							{"3","3", "3", "3","3"}};
	static String[][] n4 = {{"4"," ", "4", " "," "},
							{"4"," ", "4", " "," "},
							{"4","4", "4", "4","4"},
							{" "," ", " ", "4"," "},
							{" "," ", " ", "4"," "}};
	static String[][] n5 = {{"5","5", "5", "5","5"},
							{"5"," ", " ", " "," "},
							{"5","5", "5", "5"," "},
							{" "," ", " ", "5"," "},
							{"5","5", "5", "5"," "}};
	static String[][] n6 = {{"6"," ", " ", " "," "},
							{"6"," ", " ", " "," "},
							{"6","6", "6", "6","6"},
							{"6"," ", " ", " ","6"},
							{"6","6", "6", "6","6"}};
	static String[][] n7 = {{"7","7", "7", "7","7"},
		   					{" "," ", " ", "7"," "},
		   					{" "," ", "7", " "," "},
		   					{" "," ", "7", " "," "},
		   					{" "," ", "7", " "," "}};
	static String[][] n8 = {{"8","8", "8", "8","8"},
		   					{"8"," ", " ", " ","8"},
		   					{" ","8", "8", "8"," "},
		   					{"8"," ", " ", " ","8"},
		   					{"8","8", "8", "8","8"}};
	static String[][] n9 = {{" ","9", "9", "9","9"},
							{"9"," ", " ", " ","9"},
							{" ","9", "9", "9","9"},
							{" "," ", " ", " ","9"},
							{" "," ", " ", " ","9"}};
	static String[][] n0 = {{"0","0", "0", "0","0"},
		   					{"0"," ", " ", " ","0"},
		   					{"0"," ", " ", " ","0"},
		   					{"0"," ", " ", " ","0"},
		   					{"0","0", "0", "0","0"}};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number: ");
		String ns = in.next();
		for (int r = 0; r < 5; r++)
		{
			printRow(ns,r);
			System.out.println();
		}
		in.close();
	}
	public static void printRow(String number, int row)
	{
		for (int i = 0; i < number.length(); i++)
			printPart(Integer.parseInt(number.charAt(i)+""),row);
	}
	public static void printPart(int n, int le) //outputs a digit part of a level
	{
		if (n==1)
			System.out.print(n1[le][0]+n1[le][1]+n1[le][2]+n1[le][3]+n1[le][4]+" "); 
		else if (n==2)
			System.out.print(n2[le][0]+n2[le][1]+n2[le][2]+n2[le][3]+n2[le][4]+" "); 
		else if (n==3)
			System.out.print(n3[le][0]+n3[le][1]+n3[le][2]+n3[le][3]+n3[le][4]+" "); 	
		else if (n==4)
			System.out.print(n4[le][0]+n4[le][1]+n4[le][2]+n4[le][3]+n4[le][4]+" "); 	
		else if (n==5)
			System.out.print(n5[le][0]+n5[le][1]+n5[le][2]+n5[le][3]+n5[le][4]+" ");			
		else if (n==6)
			System.out.print(n6[le][0]+n6[le][1]+n6[le][2]+n6[le][3]+n6[le][4]+" "); 				
		else if (n==7)
			System.out.print(n7[le][0]+n7[le][1]+n7[le][2]+n7[le][3]+n7[le][4]+" ");					
		else if (n==8)
			System.out.print(n8[le][0]+n8[le][1]+n8[le][2]+n8[le][3]+n8[le][4]+" "); 						
		else if (n==9)
			System.out.print(n9[le][0]+n9[le][1]+n9[le][2]+n9[le][3]+n9[le][4]+" "); 							
		else if (n==0)
			System.out.print(n0[le][0]+n0[le][1]+n0[le][2]+n0[le][3]+n0[le][4]+" "); 
	}
}
