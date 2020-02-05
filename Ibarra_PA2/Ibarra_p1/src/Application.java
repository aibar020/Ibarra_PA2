import java.util.Scanner;
public class Application 
{
	public static void main (String[] args)
	{
		int choice;
		int [] numberArray = new int [4];
		int [] copyOfArray = new int [4];
		
		// Scanning in user input, allowing the user
		// to choose to encrypt or decrypt and having the user
		// input their numbers
		Scanner input = new Scanner(System.in);
		System.out.print("Press 1 to encrypt or 2 to decrypt ");
		choice = input.nextInt();
		System.out.print("Enter a 4 digit number: ");
		
		String temp = input.next();
		// Converting the input string to an integer and 
		// setting them equal to the two integer arrays
		for (int i = 0; i < 4; i++)
		{
			numberArray[i] = ((temp.charAt(i)) - '0');
			copyOfArray[i] = ((temp.charAt(i)) - '0');
		}
		if (choice == 1)
		{
			Encrypter.encrypt(numberArray, copyOfArray);
			System.out.print("Your encrypted number is: ");
		}
		if (choice == 2)
		{
			Decrypter.decrypt(numberArray, copyOfArray);
			System.out.print("Your decrypted number is: ");
		}
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(numberArray[i]);
		}
		input.close();
	}
}
