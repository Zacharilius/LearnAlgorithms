package codingPractice;

/**
 * Finds the middle of a circular array. A circular array is an array that 
 * is sorted but the lowest value may not be in position 0
 * 
 * @author zacharilius
 *
 */
public class FindStartCircularArray {
	/**
	 * Finds the smallest value in a circular array using a modified
	 * binary search.
	 * 
	 * @param circArr The sorted circular array
	 * @return The integer position in the circular array of the lowest value
	 */
	public static int findSmallestInt(int[] circArr){
		//Checks unique cases, if array is length 0 or 1.
		if(circArr.length == 0){
			throw new Error("Empty array");
		}
		else if(circArr.length == 1){
			return 0;
		}

		//circArray is > length 1 so this code will calculate the smallest value in O(log-2)
		int left = 0;
		int right = circArr.length - 1;
		int middle = (left + right) / 2;
		int startLowPos;
		while(true){
			//if/else chooses if smallest value is on left or right of partition
			if((circArr[left]  <= circArr[middle] && circArr[left] < circArr[right]) || circArr[middle] < circArr[right]){
				right = middle;
				
			}
			else{
				left = middle;
			}
			middle = (left + right) / 2;
			
			//Once left == middle, the smallest value has been found. 
			if(left == middle){
				if(circArr[left] <= circArr[right]){
					startLowPos =  left;
				}
				else{
					startLowPos =  right;
				}
				//Handles the case that the left and middle variables are the smallest value
				//but there are multiple smallest values. 
				while(startLowPos > 0){
					if(circArr[startLowPos] != circArr[startLowPos - 1]){
						return startLowPos;
					}
					startLowPos--;
				}
				return startLowPos;
			}
		}
	}

}
