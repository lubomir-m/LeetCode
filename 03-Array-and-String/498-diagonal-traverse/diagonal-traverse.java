class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
            int[] result = new int[mat.length * mat[0].length];
            int index = 0;
            boolean[][] visited = new boolean[mat.length][mat[0].length];
            traverse(0, 0, 0, mat, visited, result);
            return result;
        }

        private void traverse(int index, int row, int col, int[][] matrix, boolean[][] visited, int[] result) {
            if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length ||
            visited[row][col]) {
                return;
            }

            visited[row][col] = true;
            result[index] = matrix[row][col];

            traverse(index + 1, row - 1, col + 1, matrix, visited, result);
            traverse(index + 1, row + 1, col - 1, matrix, visited, result);
            if (row - 1 < 0 || col + 1 >= matrix[row].length) {
                traverse(index + 1, row, col + 1, matrix, visited, result);
                traverse(index + 1, row + 1, col, matrix, visited, result);
            }

            if (col - 1 < 0 || row + 1 >= matrix.length) {
                traverse(index + 1, row + 1, col, matrix, visited, result);
                traverse(index + 1, row, col + 1, matrix, visited, result);
            }
        }
}