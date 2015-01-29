package general;

import java.util.Random;

public class FindStartCircularArray {
	public static int findMiddle(int[] circArr){
		if(circArr.length == 0){
			throw new Error("Empty array");
		}
		else if(circArr.length == 1){
			return 0;
		}
		/*else if(circArr.length == 2){
			if(circArr[0] <= circArr[1]){
				return 0;
			}
			return 1;
		}*/
		int left = 0;
		int right = circArr.length - 1;
		int middle = (left + right) / 2;
		int startLowPos;
		while(true){
			if((circArr[left]  <= circArr[middle] && circArr[left] < circArr[right]) || circArr[middle] < circArr[right]){
				right = middle;
				
			}
			else{
				left = middle;
			}
			middle = (left + right) / 2;
			
			if(left == middle){
				if(circArr[left] <= circArr[right]){
					startLowPos =  left;
				}
				else{
					startLowPos =  right;
				}
				while(startLowPos > 0){
					if(circArr[startLowPos] != circArr[startLowPos - 1]){
						System.out.println(startLowPos);
						return startLowPos;
					}
					startLowPos--;
				}
				System.out.println(startLowPos);
				return startLowPos;
			}
		}
	}

}
