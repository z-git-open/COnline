package LC;

public class dumpGround {
	
	/*boolean moveHelper(int[][] matrix, int[][] visited, int rowIdx, int columnIdx, char direction) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		if (rowIdx < 0 || rowIdx >= rows || columnIdx < 0 || columnIdx >= columns)
			return false;
		if (visited[rowIdx][columnIdx] == 1)
			return false;

		// general work flow
		result.add(matrix[rowIdx][columnIdx]);
		visited[rowIdx][columnIdx] = 1;
		
		if(direction == 'R'){
			if(moveHelper(matrix, visited, rowIdx, columnIdx+1, direction) == false){
				return moveHelper(matrix, visited, rowIdx+1, columnIdx, 'D');
			}
			else return true;
		}
		else if(direction == 'D'){
			if(moveHelper(matrix, visited, rowIdx+1, columnIdx, direction) == false){
				return moveHelper(matrix, visited, rowIdx, columnIdx-1, 'L');
			}
			else return true;
		}
		else if (direction == 'L'){
			if(moveHelper(matrix, visited, rowIdx, columnIdx-1, direction) == false){
				return moveHelper(matrix, visited, rowIdx-1, columnIdx, 'U');
			}
			else return true;
		}
		else{
			//going up
			if(moveHelper(matrix, visited, rowIdx-1, columnIdx, direction) == false){
				return moveHelper(matrix, visited, rowIdx, columnIdx+1, 'R');
			}
			else return true;
		}
	}*/

}
