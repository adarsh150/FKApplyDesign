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


class Player1 implements Board{

	public int[] EmptyPosition()
	{
		int[] a = new int[2];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(board[i][j] == '-')
				{
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		return a;
	}

	public void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean isBoardFull()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j] == '-')
					return false;
			}
		}
		return true;
	}
}

class Player2 implements Board{

	public int[] EmptyPosition()
	{
		int[] a = new int[2];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(board[i][j] == '-')
				{
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}	
		return a;
	}
	
	public void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}


	public boolean isBoardFull()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j] == '-')
					return false;
			}
		}
		return true;
	}
}
public class TicTacToeGame{
	public static void main(String[] args)
	{
		
	}
}	