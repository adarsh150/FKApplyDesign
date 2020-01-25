package learnJava;

import java.util.*;

interface Board{
	public char[][] board = { {'-','-','-'},{'-','-','-'}, {'-','-','-'}};
	public void fillBoard(int i,int j);
	public boolean isWinnerRowWise();
	public boolean isWinnerColoumnsWise();
	public boolean isWinnerDiagonalWise();
	public int[] EmptyPosition();
	public void printBoard();
	public boolean isBoardFull();
}

public class TicTacToeGame{
	public static void main(String[] args)
	{
		
	}
}	