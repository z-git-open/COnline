package LC;

public class _79_word_search {
	public boolean exist(char[][] board, String word) {
        //special case & boundary check
        if(board == null || board.length == 0 || board[0].length == 0 || word.length() == 0)
            return false;
            
        //general work flow
        int width = board[0].length;
        int height = board.length;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(existHelper(board, i, j, word))
                    return true;
            }
        }
        return false;
    }
    
    boolean existHelper(char[][] board, int i, int j, String word){
        //special case
        if(word.length() == 0) return true;
        
        //general work flow
        int width = board[0].length;
        int height = board.length;
        if(i < width && j < height){
            if(board[i][j] == word.charAt(0)){
                return existHelper(board, i+1, j, word.substring(1)) || existHelper(board, i, j+1, word.substring(1));
            }
        }
        return false;
    }

}
