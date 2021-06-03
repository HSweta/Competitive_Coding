package Assignment;

public class Soduko {

	public static void main(String[] args) {
		
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		Soduko l = new Soduko();
		boolean h = l.S(board, 0, 0);

	}
	    public void solveSudoku(char[][] board) {
	        if(S(board,0,0))
	            return;
	    }
	    public boolean S(char[][] board, int i, int j) {

			if (i == board.length) {
				for (int a = 0; a < board.length; a++) {
					for (int b = 0; b < board[0].length; b++) {
						System.out.print(board[a][b] + " ");
					}
					System.out.println();
				}
				return true;
			}
			int ni = 0;
			int nj = 0;

			if (j == board[0].length - 1) {
				ni = i + 1;
				nj = 0;
			} else {
				ni = i;
				nj = j + 1;
			}

			if (board[i][j] != '.') {
				if( S(board, ni, nj))return true;
			} else {
				 for(int x=1;x<=9;x++)
	           {
	                if(isValid(board,i,j,(char)(x+'0')))
	              {
	                   board[i][j]=(char)(x+'0');
	                   
	                  if(S(board,ni,nj))return true ;
	                    board[i][j]='.';
	              }
	           }
			}
	        return false;

		}

		public boolean isValid(char[][] board, int ni, int nj, char po) {

			for (int i = 0; i < board.length; i++) {
				if (board[i][nj] == po)
					return false;
			}

			for (int i = 0; i < board[0].length; i++) {
				if (board[ni][i] == po)
					return false;
			}

			int smi = (ni / 3) * 3;
			int smj = (nj / 3) * 3;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[smi + i][smj + j] == po) {
						return false;
					}
				}
			}
			return true;

		}
	}


