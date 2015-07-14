import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		System.out.println(encryptLine(input.nextLine()));
		input.close();
	}
	public static String encryptLetter(char ch) 
	{
		if (!Character.isAlphabetic(ch))
			return ch+"";
		
		int chcode = (int) ch;
		char enchar;
		int val = 13; //add on value for encryption
		
		if (chcode >= 78) //wrap around needed
		{
			int diff = 90 - (int) ch;
			val -= diff + 1;
			enchar = (char) ((int)'A' + val);
		}
		else //wrap around isn't needed
		{
			enchar = (char) (chcode + val);
		}
		return enchar + "";
	}
	public static String encryptLine(String line)
	{
		String enline = "";
		for (int i = 0; i < line.length(); i++)
		{
			enline += encryptLetter(line.charAt(i));
		}
		return enline;
	}

}
