package grid.view;

import grid.model.Chatbot;

public class GridView
{
	
	/**
	 * 
	 * @param currentArray
	 */
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("\n" + "foreach printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber :currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n" + "for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col +":" + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}

	/**
	 * 
	 * @param currentArray
	 */
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("\n" + "foreach printing");
		for(String [] currentRow : currentArray)
		{
			for(String currentWord :currentRow)
			{
				System.out.print(currentWord + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n" + "for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col +":" + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
		
	}

	/**
	 * 
	 * @param currentArray
	 */
	public void printModelStates(Chatbot [][] currentArray)
	{
		int counter = 0;
		
		System.out.println("\n" + "foreach printing");
		for(Chatbot [] currentRow : currentArray)
		{
			for(Chatbot currentChatbot :currentRow)
			{
				
				System.out.print(currentChatbot.getMyState().get(counter) + "\t");
				
				counter++;
			}
			System.out.println();
		}
		
		counter = 0;
		
		System.out.println("\n" + "for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col +":" + currentArray[row][col].getMyState().get(counter) + "\t");
			
				counter++;
			}
			System.out.println();
		}
	}
}
