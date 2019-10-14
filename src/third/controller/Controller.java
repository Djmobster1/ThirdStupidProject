package third.controller;

//Need to import popup since its in a different package
import third.view.Popup;
import java.util.ArrayList;

public class Controller
{

	private Popup view;

	public Controller()
	{
		view = new Popup();
	}

	public void start()
	{
		usingLists();
//		loopTest();

//		System.out.println("Batman is the Dark Knight");
//		System.out.print("Huey is the best Boondocks character");
//		System.out.println(" Black Magic");

	}

	private void loopTest()
	{
		// Simon says do something and stop when simon says stop
		// AKA while loop

		// Step 1: Define a variable
		boolean isFinished = false;

		view.displayMessage("Let's have some loops!");

		int count = 0;
		// Step 2: Test the variable
		while (!isFinished)
		{
			// Set 3: Do things!
			System.out.println("Words on the screen" + count);

			// view.displayMessage(count + "");
			String response = view.askQuestion("Hi there what is going on?");
			view.displayMessage("You said: " + response);
			count++;

			if (count > 130)
			{
				isFinished = true; // Step 4!! Make stopping point!
			}
		}

		System.out.println("Count is at: " + count);

		while (count > 0)
		{
			System.out.println(count);
			count--;
		}

		int special = 1;
		do
		{
			System.out.println(special);
			special--;
		} while (special > 0);

		for (int spot = 0; spot < 100; spot++)
		{
			System.out.println("Spot is: " + spot);
		}

		// Spot is not visible anymore

	}

	private void usingLists()
	{
		ArrayList<String> userInput = new ArrayList<String>();

		String input = view.askQuestion("Type in some words, or type done to stop");
		
		while (!input.equalsIgnoreCase("done"))
		{
			userInput.add(input);
			input = view.askQuestion("Keep typing or type done");
		}
	}

}
