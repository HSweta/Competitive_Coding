package Assignment;

public class Sudoku_Solver {

	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		Sudoku_Solver l = new Sudoku_Solver();
		l.Solver(board, 0, 0);

	}

	public void display(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void Solver(char[][] board, int i, int j) {

		if (i == board.length) {
			for (int a = 0; a < board.length; a++) {
				for (int b = 0; b < board[0].length; b++) {
					System.out.print(board[a][b] + " ");
				}
				System.out.println();
			}
			return;
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
           //System.out.println("_____---");
		if (board[i][j] != '.') {
			Solver(board, ni, nj);
		} else {
			for (char po = '1'; po <= '9'; po++) {
				if (isValid(board, i, j, po) == true) {
					board[i][j] = po;
					Solver(board, ni, nj);
					board[i][j] = '.';
				}
			}
		}
		
		//System.out.println("_____---");

	}

	public boolean isValid(char[][] board, int x, int y, char po) {

		for (int i = 0; i < board.length; i++) {
			if (board[i][y] == po)
				return false;
		}

		for (int i = 0; i < board[0].length; i++) {
			if (board[x][i] == po)
				return false;
		}

		int smi = x / 3 * 3;
		int smj = y / 3 * 3;

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
