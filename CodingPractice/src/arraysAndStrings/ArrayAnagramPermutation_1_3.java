package arraysAndStrings;

public class ArrayAnagramPermutation_1_3 {
	public static void main(String args[]){
		if(args.length == 0){
			if(stringsPermutation("abba", "baab")){
				System.out.println("The strings are permutations");
			}
			else{
				System.out.println("The strings are NOT permutations");
			}
		}
	}
	public static boolean stringsPermutation(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		//System.out.println(new String(aChar));
		//System.out.println(new String(bChar));
		
		java.util.Arrays.sort(aChar);
		java.util.Arrays.sort(bChar);
		//System.out.println(new String(aChar));
		//System.out.println(new String(bChar));
		
		
		
		if(new String(aChar).equals(new String(bChar))){
			return true;
		}
		return false;
	}
}
