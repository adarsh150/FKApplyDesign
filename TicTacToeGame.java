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

	public boolean isWinnerColoumnsWise()
	{
		for(int j=0;j<3;j++)
		{
			char ch = board[0][j];
			int i=0;
			for(i=1;i<3;i++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(i == 3)
				return true;
		}
		return false;
	}



	public boolean isWinnerDiagonalWise()
	{

		char ch = board[0][0];
		int i=0;
		for(i=1;i<3;i++)
		{
			if(ch=='-' || ch!=board[i][i])
			break;
		}
		if(i == 4)
			return true;
		ch = board[0][2];
		i = 1;
		int j = 1;
		for(;i<3 && j>=0;)
		{
			if(ch=='-' || ch!=board[i][j])
			break;
			i++;
			j--;
		}
		if(i == 3 && j==-1)
			return true;

		return false;
	}

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

	public boolean isWinnerColoumnsWise()
	{
		for(int j=0;j<3;j++)
		{
			char ch = board[0][j];
			int i=0;
			for(i=1;i<3;i++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(i == 3)
				return true;
		}
		return false;
	}
	
	public boolean isWinnerDiagonalWise()
	{
		char ch = board[0][0];
		int i=0;
		for(i=1;i<3;i++)
		{
			if(ch=='-' || ch!=board[i][i])
			break;
		}
		if(i == 4)
			return true;

		ch = board[0][2];
		i = 1;
		int j = 1;
		for(;i<3 && j>=0;)
		{
			if(ch=='-' || ch!=board[i][j])
			break;
			i++;
			j--;
		}
		if(i == 3 && j==-1)
			return true;

		return false;
	}
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