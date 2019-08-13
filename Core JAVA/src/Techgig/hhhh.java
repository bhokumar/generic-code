package Techgig;

public class hhhh {

	public static String[][] sqBoard = new String[][] {{"a", "b", "c"},{"d" , "e", "f"}, {"g", "h", "i"}, {"", "j" , ""}};
	public static void main(String[] args) {
		
		for(int idx = 0; idx < sqBoard.length; idx++)
		{
			for(int i = 0; i < sqBoard[idx].length; i++)
			{
				System.out.print(sqBoard[idx][i]);
			}
			System.out.println("");
		}
		nthLevel(2);

	}

	
	private static void nthLevel(int levelNum)
	{
		int mid = sqBoard[0].length / 2;
		int k = 0;
		int numPossibility = 0;
		for(int idx = 0; idx < sqBoard.length; idx++)
		{
			for(int j = 0; j < sqBoard[idx].length; j++)
			{
				if(mid == j && ((k - 1 != 0) || (k + 1 != sqBoard.length)))
				{
					numPossibility += (int)Math.pow(2, levelNum);
				}
			    k++;
			}
		}
	}
}
