package LC;

import java.util.*;

public class lc_54_spiral_matrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null)
			return result;
		int rows = matrix.length;
		if (rows == 0)
			return result;
		int columns = matrix[0].length;
		if (columns == 0)
			return result;
			
		int[][] visited = new int[rows][columns];
		
		moveHelper(matrix, new int[rows][columns], 0, 0, 'R');
		return result;
	}

	List<Integer> result = new ArrayList<Integer>();
	/*
	 * 
	 * 1. define start point
	 * 2. define boundary
	 * 3. define stop condition
	 * 4. Loop
	 * 
	 */
	
	void moveHelper(int[][] matrix, int[][] visited, int rowIdx, int columnIdx, char direction) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		if (rowIdx < 0 || rowIdx >= rows || columnIdx < 0 || columnIdx >= columns)
			return;
		if (visited[rowIdx][columnIdx] == 1)
			return;

		// general work flow
		if(direction == 'R'){
			while(columnIdx < columns && visited[rowIdx][columnIdx] == 0){
				result.add(matrix[rowIdx][columnIdx]);
				visited[rowIdx][columnIdx] = 1;
				columnIdx++;
			}
			moveHelper(matrix, visited, rowIdx+1, columnIdx-1, 'D');
		}
		else if(direction == 'D'){
			while(rowIdx < rows && visited[rowIdx][columnIdx] == 0){
				result.add(matrix[rowIdx][columnIdx]);
				visited[rowIdx][columnIdx] = 1;
				rowIdx++;
			}
			moveHelper(matrix, visited, rowIdx-1, columnIdx-1, 'L');
		}
		else if (direction == 'L'){
			while(columnIdx >= 0 && visited[rowIdx][columnIdx] == 0){
				result.add(matrix[rowIdx][columnIdx]);
				visited[rowIdx][columnIdx] = 1;
				columnIdx--;
			}
			moveHelper(matrix, visited, rowIdx-1, columnIdx+1, 'U');
		}
		else{
			//going up
			while(rowIdx >= 0 && visited[rowIdx][columnIdx] == 0){
				result.add(matrix[rowIdx][columnIdx]);
				visited[rowIdx][columnIdx] = 1;
				rowIdx--;
			}
			moveHelper(matrix, visited, rowIdx+1, columnIdx+1, 'R');
		}
	}

}
