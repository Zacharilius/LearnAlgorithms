package interviewQuestions;

public class RotateNByNMatrix_1_6 {
	public static void main(String[] args){
		int[][] matrix = create(4,4);
		System.out.println(toString(matrix));
		//matrix = rotate(matrix);
		System.out.println(toString(matrix));
		makeCol0_1_7(matrix);
		System.out.println(toString(matrix));
	}
	public static int[][] create(int y, int x){
		int[][] matrix = new int[y][x];
		int cellNum = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = cellNum++;
			}
		}
		return matrix;
	}
	public static int[][] rotate(int[][] matrix){
		int[][] rotateMatrix = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				rotateMatrix[j][i] = matrix[i][j];
			}
		}
		return rotateMatrix;
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
	public static void makeCol0_1_7(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[j][i] == 0){
					makeCol0Helper(matrix, i);
					break;
				}
			}
		}
	}
	public static void makeCol0Helper(int[][] matrix, int x){
		System.out.println(x);
		for(int i = 0; i < matrix[0].length; i++){
			matrix[i][x] = 0;
		}
	}
}
