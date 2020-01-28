package learnJava;

import java.util.*;

interface Board{
	public char[][] board = { {'-','-','-','-'},{'-','-','-','-'}, {'-','-','-','-'},{'-','-','-','-'}};
	int N = 4;
	Scanner sc = new Scanner(System.in);
	public void fillBoard(int i,int j);
	public boolean isWinnerRowWise();
	public boolean isWinnerColoumnsWise();
	public boolean isWinnerDiagonalWise();
	public int[] EmptyPosition();
	public void printBoard();
	public boolean isBoardFull();
	public int[] makeMove();
}


class Player1 implements Board{

	public void fillBoard(int i,int j)
	{
		board[i][j] = 'X';
	}

	public int[] makeMove()
	{
		int[] coordinates = new int[2];
		int undoMoveOrNot,row_indx,col_indx;

		System.out.println("Player1 Enter the coordinate = ");
		row_indx = sc.nextInt();
		col_indx = sc.nextInt();
		while(true)
		{
			System.out.println("Do you want to undo your move 0/1 = ");
			undoMoveOrNot = sc.nextInt();
			if(undoMoveOrNot == 1)
			{
				System.out.println("Player1 Enter the coordinate again = ");
				row_indx = sc.nextInt();
				col_indx = sc.nextInt();
			}
			else
			{
				break;
			}
		}
		coordinates[0] = row_indx;
		coordinates[1] = col_indx;
		return coordinates;
	}


	public boolean isWinnerRowWise()
	{

		for(int i=0;i<N;i++)
		{
			char ch = board[i][0];
			int j=0;
			for(j=1;j<N;j++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(j == N)
				return true;
		}
		return false;
	}

	public boolean isWinnerColoumnsWise()
	{
		for(int j=0;j<N;j++)
		{
			char ch = board[0][j];
			int i=0;
			for(i=1;i<N;i++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(i == N)
				return true;
		}
		return false;
	}



	public boolean isWinnerDiagonalWise()
	{

		char ch = board[0][0];
		int i=0;
		for(i=1;i<N;i++)
		{
			if(ch=='-' || ch!=board[i][i])
			break;
		}
		if(i == N)
			return true;
		ch = board[0][N-1];
		i = 1;
		int j = N-2;
		for(;i<N && j>=0;)
		{
			if(ch=='-' || ch!=board[i][j])
			break;
			i++;
			j--;
		}
		if(i == N && j==-1)
			return true;

		return false;
	}

	public int[] EmptyPosition()
	{
		int[] a = new int[2];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
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
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean isBoardFull()
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(board[i][j] == '-')
					return false;
			}
		}
		return true;
	}
}

class Player2 implements Board{

	public void fillBoard(int i,int j)
	{
		board[i][j] = 'O';
	}

	public int[] makeMove()
	{
		int[] coordinates = new int[2];
		int undoMoveOrNot,row_indx,col_indx;

		System.out.println("Player2 Enter the coordinate = ");
		row_indx = sc.nextInt();
		col_indx = sc.nextInt();
		while(true)
		{
			System.out.println("Do you want to undo your move 0/1 = ");
			undoMoveOrNot = sc.nextInt();
			if(undoMoveOrNot == 1)
			{
				System.out.println("Player2 Enter the coordinate again = ");
				row_indx = sc.nextInt();
				col_indx = sc.nextInt();
			}
			else
			{
				break;
			}
		}
		coordinates[0] = row_indx;
		coordinates[1] = col_indx;
		return coordinates;
	}
	public boolean isWinnerRowWise()
	{
		for(int i=0;i<N;i++)
		{
			char ch = board[i][0];
			int j=0;
			for(j=1;j<N;j++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(j == N)
				return true;
		}

		return false;
	}

	public boolean isWinnerColoumnsWise()
	{
		for(int j=0;j<N;j++)
		{
			char ch = board[0][j];
			int i=0;
			for(i=1;i<N;i++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(i == N)
				return true;
		}
		return false;
	}

	public boolean isWinnerDiagonalWise()
	{
		char ch = board[0][0];
		int i=0;
		for(i=1;i<N;i++)
		{
			if(ch=='-' || ch!=board[i][i])
			break;
		}
		if(i == N)
			return true;

		ch = board[0][N-1];
		i = 1;
		int j = N-2;
		for(;i<N && j>=0;)
		{
			if(ch=='-' || ch!=board[i][j])
			break;
			i++;
			j--;
		}
		if(i == N && j==-1)
			return true;

		return false;
	}
	public int[] EmptyPosition()
	{
		int[] a = new int[2];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
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
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}


	public boolean isBoardFull()
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
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
		Scanner sc = new Scanner(System.in);
		System.out.println("For Game Between Two Players type 0 and for Game Between Player and Machine type 1");
		int choice = sc.nextInt();
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		int flag = 0;    // flag%2 == 0 p1 else p2;
		while(true)
		{
			if(flag%2 == 0)
			{
				if(!p1.isBoardFull())
				{
					int[] coordinates = new int[2];
					coordinates =  p1.makeMove();
					p1.fillBoard(coordinates[0],coordinates[1]);
					p1.printBoard();
					if(p1.isWinnerRowWise() || p1.isWinnerColoumnsWise() || p1.isWinnerDiagonalWise())
					{
						System.out.println("Player1 is Winner");
						break;
					}
				}
				else
				{
					if(p1.isWinnerRowWise() || p1.isWinnerColoumnsWise() || p1.isWinnerDiagonalWise())
					{
						System.out.println("Player1 is Winner\n");
					}
					else
					{
						System.out.println("No-one wins\n");
					}
					break;
				}
			}
			else
			{
				if(!p2.isBoardFull())
				{
					if(choice == 0)
					{
						int[] coordinates = new int[2];
						coordinates =  p2.makeMove();
						p2.fillBoard(coordinates[0],coordinates[1]);
					}
					else
					{
						int[] a = p2.EmptyPosition();
						p2.fillBoard(a[0],a[1]);
					}
					p2.printBoard();
					if(p2.isWinnerRowWise() || p2.isWinnerColoumnsWise() || p2.isWinnerDiagonalWise())
					{
						System.out.println("Player2 is Winner");
						break;
					}
				}
				else
				{
					if(p2.isWinnerRowWise() || p2.isWinnerColoumnsWise() || p2.isWinnerDiagonalWise())
					{
						System.out.println("Player2 is Winner\n");
					}
					else
					{
						System.out.println("No-one wins\n");
					}
					break;
				}
			}
			flag++;
		}
	}
}	