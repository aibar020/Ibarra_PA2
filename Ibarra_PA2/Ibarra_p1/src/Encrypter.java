
public class Encrypter 
{
	public static int[] encrypt(int [] numberArray, int [] copyOfArray)
	{
		// Encrypting values using arithmetic and mod operations
		for (int i = 0; i < 4; i++)
		{
			numberArray[i] = ((numberArray[i] + 7) % 10);
			copyOfArray[i] = ((copyOfArray[i] + 7) % 10);
		}
		// Using the two arrays to swap values
		numberArray[0] = numberArray[2];
		numberArray[1] = numberArray[3];
		numberArray[2] = copyOfArray[0];
		numberArray[3] = copyOfArray[1];
		
		return numberArray;
	}
}
