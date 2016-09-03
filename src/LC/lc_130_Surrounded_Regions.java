package LC;

import java.util.LinkedList;
import java.util.Queue;

public class lc_130_Surrounded_Regions {
	public void solve(char[][] board) {
        //special
        if(board == null || board.length == 0) 
            return;
            
        //general flow        
        int rows = board.length;
        int columns = board[0].length;
        
        for(int c = 0; c < columns; c++){
            if(board[0][c] == 'O')
                flipHelper(board, 0, c);
            if(board[rows-1][c] == 'O')
                flipHelper(board, rows-1, c);
        }
        for(int r = 0; r < rows; r++){
            if(board[r][0] == 'O')
                flipHelper(board, r, 0);
            if(board[r][columns-1] == 'O')
                flipHelper(board, r, columns-1);
        }
    }
    
    /*void flipHelper(char[][] board, int i, int j){
        int rows = board.length;
        int columns = board[0].length;
        if(i >= 0 && i < rows && j >= 0 && j < columns && board[i][j] == 'O'){
            board[i][j] = 'X';
            flipHelper(board, i+1, j);
            flipHelper(board, i-1, j);
            flipHelper(board, i, j+1);
            flipHelper(board, i, j-1);
        }
    }*/
    
	void flipHelper(char[][] board, int i, int j){
        int rows = board.length;
        int columns = board[0].length;
        Queue<int[]> flips = new LinkedList<int[]>();
        if(0 <= i && i < rows && 0 <= j && j < columns && board[i][j] == 'O')
            flips.add(new int[]{i, j});
        while(flips.size() != 0){
        	int[] pos = flips.remove();
        	int r = pos[0];
        	int c = pos[1];
        	board[r][c] = 'X';
        	
        	if(r+1 >= 0 && r+1 < rows && board[r+1][c] == 'O')
        		flips.add(new int[]{r+1, c});
        	if(r-1 >= 0 && r-1 < rows && board[r-1][c] == 'O')
        		flips.add(new int[]{r-1, c});
        	if(c+1 >= 0 && c+1 < columns && board[r][c+1] == 'O')
        		flips.add(new int[]{r, c+1});
        	if(c-1 >= 0 && c-1 < columns && board[r][c-1] == 'O')
        		flips.add(new int[]{r, c-1});
        }
    }
}
