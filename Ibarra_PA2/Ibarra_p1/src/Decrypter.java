
public class Decrypter 
{
	public static int[] decrypt(int [] numberArray, int [] copyOfArray)
	{
		
		
		for (int i = 0; i < 4; i++)
		{
			if (numberArray[i] > 6)
			{
				numberArray[i] = 7 - numberArray[i];
				copyOfArray[i] = 7 - copyOfArray[i];
			}
			if (numberArray[i] <= 6)
			{
				numberArray[i] = 3 + numberArray[i];
				copyOfArray[i] = 3 + copyOfArray[i];
			}
		}
		
		System.out.println(numberArray[0]);
		System.out.println(numberArray[1]);
		System.out.println(numberArray[2]);
		System.out.println(numberArray[3]);
		
		numberArray[0] = copyOfArray[2];
		numberArray[1] = copyOfArray[3];
		numberArray[2] = copyOfArray[0];
		numberArray[3] = copyOfArray[1];
		
		return numberArray;
	}
}
