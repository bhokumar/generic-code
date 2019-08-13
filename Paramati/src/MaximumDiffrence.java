
public class MaximumDiffrence {

	public static void main(String[] args) {
		int[] r = new int[] {3, 1, 6, 7};
		maxmimumDiff(r);

	}

	public static int maxmimumDiff(int[] arr)
	{
	  int  max = -1;
	  for(int idx = 0; idx < arr.length; idx++)
	  {
		  for(int j = idx + 1; j < arr.length; j++) {
			  
			  if(idx < j && arr[idx] < arr[j])
				  max = arr[j] - arr[idx];
		  }
	  }
	  
	  System.out.println(max);
	  return max;
	}
	
	
	/**
	 * import java.util.ArrayList;
import java.util.Collections;

public class MaximumDiffrence {

	public static void main(String[] args) {
		String[] r = new String[] { "julab-jamun", "jagar" , "jagar"};
		whichSweetShouldIBring(r);

	}

	static void whichSweetShouldIBring(String[] votes) {

		ArrayList<String> list = new ArrayList<>();
		int max = 0;
		for (int idx = 0; idx < votes.length; idx++) {
			int y = -1;
			for (int j = idx + 1; j < votes.length; j++) {

				if (votes[idx].equals(votes[j])) {
					y++;
				}
			}
			if (max < y)
				max = y;

			if (max == y) {
				list.add(votes[idx]);
			}

		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}

	 */
}
