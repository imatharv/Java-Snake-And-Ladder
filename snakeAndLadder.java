import java.util.Random;

public class snakeAndLadder
{
	public static void main(String[] args)
	{
		int ladder = 1;
		int snake = 2;
		int noplay = 0;
		int position = 0;
		int diceRoll = 0;

		Random randomObject = new Random();

		while(position != 100)
		{
			int dice = randomObject.nextInt(6)+1; //Returns random numbers between 1-6
        	        System.out.println("Dice outcome is: "+dice);
	                int play = randomObject.nextInt(3); //Return random numbers between 0-2

			diceRole++;

			if(play != noplay) {
				if(play == ladder)
				{
					position += dice;
					if(position>100)
					{
						position -= dice;
					}
				}
				else if(play == snake)
				{
					position -= dice;
					if(position<0)
					{
						position = 0;
					}
				}
				System.out.println("New position gained is= "+position);
			}
		}
		System.out.println("Win!!.. The player has reached the exact 100th position.\n");
		System.out.println("The dice was rolled "+diceRoll+" number of times.");
	}
}
