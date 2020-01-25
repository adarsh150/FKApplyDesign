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

	public void fillBoard(int i,int j)
	{
		board[i][j] = 'X';
	}

	public boolean isWinnerRowWise()
	{
		for(int i=0;i<3;i++)
		{
			char ch = board[i][0];
			int j=0;
			for(j=1;j<3;j++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(j == 3)
				return true;
		}
		return false;
	}

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

	public void fillBoard(int i,int j)
	{
		board[i][j] = 'O';
	}

	public boolean isWinnerRowWise()
	{
		for(int i=0;i<3;i++)
		{
			char ch = board[i][0];
			int j=0;
			for(j=1;j<3;j++)
			{
				if(ch=='-' || ch != board[i][j])
				{
					break;
				}
			}
			if(j == 3)
				return true;
		}

		return false;
	}

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
					System.out.println("Player1 Enter the coordinate = ");
					int row_indx = sc.nextInt();
					int col_indx = sc.nextInt();
					p1.fillBoard(row_indx,col_indx);
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
						System.out.println("Player2 Enter the coordinates = ");
						int row_indx = sc.nextInt();
						int col_indx = sc.nextInt();
						p2.fillBoard(row_indx,col_indx);
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