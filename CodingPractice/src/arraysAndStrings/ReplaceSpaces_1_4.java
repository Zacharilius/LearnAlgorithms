package arraysAndStrings;

public class ReplaceSpaces_1_4 {
	
	public static String replaceSpaces(String s){
		String newString = "";
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				newString += "%20";		
			}
			else{
				newString += s.charAt(i);
			}
		}
		return newString; //remove
		
		
	}
}
