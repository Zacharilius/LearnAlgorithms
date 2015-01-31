package interviewQuestions;

public class RotateNByNMatrix_1_6 {
	public static void main(String[] args){
		int[][] matrix = new int[4][4];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = i;
			}
		}
		System.out.println(toString(matrix));
		
	}
	public int[][] rotate(int[][] matrix){
		
		return new int[][]{};
	}
	
	public static String toString(int[][] matrix){
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				buff.append(matrix[i][j] + "\t");
			}
			buff.append("\n");
		}
		
		return buff.toString();
		
	}
}
