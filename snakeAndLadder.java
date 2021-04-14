import java.util.Random;

public class snakeAndLadder
{
	public static void main(String[] args)
	{
		Random randomObject = new Random();
		int dice = randomObject.nextInt(6)+1;
		System.out.println("Dice outcome is: "+dice);
	}
}
