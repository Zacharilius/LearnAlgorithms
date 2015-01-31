package interviewQuestions;

public class UniqueCharsString_1_1 {

	public static boolean uniqueCharString(String s){
		if(s.length() > 256){
			return false;
		}
		int[] intArr = new int[256];
		for(int i = 0; i < s.length(); i++){
			intArr[s.charAt(i)]++;
			if(intArr[s.charAt(i)] > 1){
				return false;
			}
		}
		return true;
		
	}

}
