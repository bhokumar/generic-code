package Algo;

/**
 * 
 * 1 2 3
 * 4 5 6
 *
 */
public class TopLeftToBottomRight {

	public static void main(String[] args) {
		TopLeftToBottomRight toBottomRight = new TopLeftToBottomRight();
		System.out.println(toBottomRight.paths(2, 3));
	}
	
	private int paths(int m, int n)
	{
		System.out.println("m = " + m + ", n = " + n);
		if(m == 1 || n == 1)
			return 1;
		
		return paths(m-1, n) + paths(m, n-1);
	}

}
