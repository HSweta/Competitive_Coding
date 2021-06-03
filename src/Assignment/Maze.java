package Assignment;

public class Maze {
	public static void main(String[] args) {
		char maze[][] = { { 'O', 'X', 'O', 'O' }, { 'O', 'O', 'O', 'X' }, { 'X', 'O', 'X', 'O' },
				{ 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'O' } };

		boolean ans = rat_cheese(maze, new boolean[maze.length][maze[0].length], 0, 0);

		if (ans == false)
			System.out.println("No Path Exist");
	}

	public static boolean rat_cheese(char maze[][], boolean visited[][], int row, int col) {
		
		if (maze[row][col] == 'X')
			return false;

		if (row == maze.length - 1 && col == maze[0].length - 1) {
			
			visited[row][col] = true;
			
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited[0].length; j++) {
					
					if (visited[i][j])
						System.out.print(1 + " ");
					else
						System.out.print(0 + " ");
				}
				
				System.out.println();
			}

			return true;
		}

		if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || visited[row][col])
			return false;

		boolean right = false, down = false, up = false, left = false;

		visited[row][col] = true;

		if (isSafe(maze,row+1,col,visited))
			down = rat_cheese(maze, visited, row + 1, col);
		
		if (isSafe(maze,row,col-1,visited))
			right = rat_cheese(maze, visited, row, col + 1);
		if (isSafe(maze,row-1,col,visited))
			up = rat_cheese(maze, visited, row - 1, col);
		if (isSafe(maze,row,col-1,visited))
			left = rat_cheese(maze, visited, row, col - 1);

		if (right || down || left || up)
			return true;

		visited[row][col] = false;

		return false;

	}
	
	public static boolean isSafe(char[][] maze,int i,int j,boolean[][] visited) {
		
		if(i>=0 && j>=0 && i < maze.length && j < maze.length && maze[i][j] == '0') {
	            return true;
	            
	}
		
		return false;
}}
