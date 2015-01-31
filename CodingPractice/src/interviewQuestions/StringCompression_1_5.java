package interviewQuestions;

public class StringCompression_1_5 {

	public static String compressString(String s) {
		//Prevent strings s with length 0 from continuing 
		if(s.length() == 0)throw new Error("Inputted string is empty");
		
		//Use Stringbuffer b/c strings are immutable and execute in O(n^2)
		StringBuffer buff = new StringBuffer();
		StringBuffer output = new StringBuffer();
		//outside loop that ensures < string length
		for(int i = 0; i < s.length(); i++){	
			//if statement that checks next char in string is the same, then append
			if(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)) buff.append(s.charAt(i));
			
			//if it isn't equal, add to the output buffer with the current buffer's length
			else {
				buff.append(s.charAt(i));
				output.append(buff.charAt(0) + "" + buff.length());
				//clear buff
				buff.delete(0, buff.length());
			}
		}
		
		//if compressed length is >= original string then return original string 
		if(output.length() >= s.length()){
			return s;
		}
				
		//else then return compressed string
		else return output.toString();
		
		
			

	}
		
}
