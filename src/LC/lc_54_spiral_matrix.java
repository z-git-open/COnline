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

		spiralMoveHelper(matrix, new int[rows][columns], 0, 0);
		return result;
	}

	List<Integer> result = new ArrayList<Integer>();

	boolean spiralMoveHelper(int[][] matrix, int[][] visited, int rowIdx, int columnIdx) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		if (rowIdx < 0 || rowIdx >= rows || columnIdx < 0 || columnIdx >= columns)
			return false;
		if (visited[rowIdx][columnIdx] == 1)
			return false;

		// general work flow
		result.add(matrix[rowIdx][columnIdx]);
		visited[rowIdx][columnIdx] = 1;
		
		
		if (columnIdx == columns-1){
			spiralMoveHelper(matrix, visited, rowIdx, columnIdx + 1))
			return true;
		}
		else{
			
		}
			
		else if (spiralMoveHelper(matrix, visited, rowIdx + 1, columnIdx))
			return true;
		else if (spiralMoveHelper(matrix, visited, rowIdx, columnIdx - 1))
			return true;
		else if (spiralMoveHelper(matrix, visited, rowIdx - 1, columnIdx + 1))
			return true;
		else
			return false;
	}

}
