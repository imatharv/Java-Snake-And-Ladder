import java.util.Random;

public class snakeAndLadder
{
	public static void main(String[] args)
	{
		int ladder = 1;
		int snake = 2;
		int noplay = 0;
		int position = 0;

		Random randomObject = new Random();
		int dice = randomObject.nextInt(6)+1; //Returns random numbers between 1-6
		System.out.println("Dice outcome is: "+dice);
		int play = randomObject.nextInt(3); //Return random numbers between 0-2

		if(play != noplay)
		{
			if(play==ladder)
			{
				position += dice;
			}
			else if(play == snake)
			{
				position -= dice;
			}
			System.out.println("New position gained is= "+position);
		}
		else
		{
			System.out.println("No play!");
		}
	}
}
