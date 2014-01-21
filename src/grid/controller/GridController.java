package grid.controller;

import grid.model.Chatbot;
import grid.view.GridView;

public class GridController
{
//Declaration Section
	
	/**
	 * 
	 */
	private int [][] randomNumbers;
	/**
	 * 
	 */
	private String [][] randomWords;
	/**
	 * 
	 */
	private Chatbot [][] modelStates;
	/**
	 * 
	 */
	private GridView display; 
	

	/**
	 * @return the randomNumbers
	 */
	public int[][] getRandomNumbers()
	{
		return randomNumbers;
	}
	/**
	 * @return the randomWords
	 */
	public String[][] getRandomWords()
	{
		return randomWords;
	}
	/**
	 * @return the modelStates
	 */
	public Chatbot[][] getModelStates()
	{
		return modelStates;
	}
	/**
	 * @return the display
	 */
	public GridView getDisplay()
	{
		return display;
	}
	/**
	 * @param randomNumbers the randomNumbers to set
	 */
	public void setRandomNumbers(int[][] randomNumbers)
	{
		this.randomNumbers = randomNumbers;
	}
	/**
	 * @param randomWords the randomWords to set
	 */
	public void setRandomWords(String[][] randomWords)
	{
		this.randomWords = randomWords;
	}
	/**
	 * @param modelStates the modelStates to set
	 */
	public void setModelStates(Chatbot[][] modelStates)
	{
		this.modelStates = modelStates;
	}
	/**
	 * @param display the display to set
	 */
	public void setDisplay(GridView display)
	{
		this.display = display;
	}

//Constructor Section
	
	/**
	 * 
	 */
	public GridController()
	{
		randomNumbers = new int [3][3];
		randomWords = new String [4][4];
		modelStates = new Chatbot [7][7];
		display = new GridView();
	}
	
//Run Section
	
	/**
	 * 
	 */
	public void start()
	{
		fillTheRandomWords();
		fillTheRandomNumbers();
		fillTheModelStates();
		display.printIntInformation(randomNumbers);
		display.printStringInformation(randomWords);
		display.printModelStates(modelStates);
	}
	
	
	/**
	 * 
	 */
	private void fillTheRandomNumbers()
	{
		randomNumbers[0][0] = 65;
		randomNumbers[0][1] = 4;
		randomNumbers[0][2] = 564;
		randomNumbers[1][0] = 54;
		randomNumbers[1][1] = 91;
		randomNumbers[1][2] = 5;
		randomNumbers[2][0] = 89;
		randomNumbers[2][1] = 879;
		randomNumbers[2][2] = 0;
	}
	
	/**
	 * 
	 */
	private void fillTheRandomWords()
	{
		randomWords[0][0] = "Popcorn";
		randomWords[0][1] =  "Honey";
		randomWords[0][2] =  "Cheeze";
		randomWords[0][3] =  "Computer";
		randomWords[1][0] =  "Random";
		randomWords[1][1] =  "Bob";
		randomWords[1][2] =  "Chill";
		randomWords[1][3] =  "Boy";
		randomWords[2][0] =  "Mouse";
		randomWords[2][1] =  "Pen";
		randomWords[2][2] =  "Headphones";
		randomWords[2][3] =  "Type";
		randomWords[3][0] =  "Plug";
		randomWords[3][1] =  "Jhon";
		randomWords[3][2] =  "Doe";
		randomWords[3][3] =  "Dough";
	}
	
	/**
	 * 
	 */
	private void fillTheModelStates()
	{
		modelStates[0][0] = new Chatbot();
		modelStates[0][1] = new Chatbot();
		modelStates[0][2] = new Chatbot();
		modelStates[0][3] = new Chatbot();
		modelStates[0][4] = new Chatbot();
		modelStates[0][5] = new Chatbot();
		modelStates[0][6] = new Chatbot();
		
		modelStates[1][0] = new Chatbot();
		modelStates[1][1] = new Chatbot();
		modelStates[1][2] = new Chatbot();
		modelStates[1][3] = new Chatbot();
		modelStates[1][4] = new Chatbot();
		modelStates[1][5] = new Chatbot();
		modelStates[1][6] = new Chatbot();
		
		modelStates[2][0] = new Chatbot();
		modelStates[2][1] = new Chatbot();
		modelStates[2][2] = new Chatbot();
		modelStates[2][3] = new Chatbot();
		modelStates[2][4] = new Chatbot();
		modelStates[2][5] = new Chatbot();
		modelStates[2][6] = new Chatbot();
		
		modelStates[3][0] = new Chatbot();
		modelStates[3][1] = new Chatbot();
		modelStates[3][2] = new Chatbot();
		modelStates[3][3] = new Chatbot();
		modelStates[3][4] = new Chatbot();
		modelStates[3][5] = new Chatbot();
		modelStates[3][6] = new Chatbot();
		
		modelStates[4][0] = new Chatbot();
		modelStates[4][1] = new Chatbot();
		modelStates[4][2] = new Chatbot();
		modelStates[4][3] = new Chatbot();
		modelStates[4][4] = new Chatbot();
		modelStates[4][5] = new Chatbot();
		modelStates[4][6] = new Chatbot();
		
		modelStates[5][0] = new Chatbot();
		modelStates[5][1] = new Chatbot();
		modelStates[5][2] = new Chatbot();
		modelStates[5][3] = new Chatbot();
		modelStates[5][4] = new Chatbot();
		modelStates[5][5] = new Chatbot();
		modelStates[5][6] = new Chatbot();
		
		modelStates[6][0] = new Chatbot();
		modelStates[6][1] = new Chatbot();
		modelStates[6][2] = new Chatbot();
		modelStates[6][3] = new Chatbot();
		modelStates[6][4] = new Chatbot();
		modelStates[6][5] = new Chatbot();
		modelStates[6][6] = new Chatbot();
	}
}
