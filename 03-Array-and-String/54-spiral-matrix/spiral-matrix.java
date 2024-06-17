class Solution {
     public List<Integer> spiralOrder(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            List<Integer> result = new ArrayList<>(n * m);
            boolean[][] visited = new boolean[n][m];
            traverse(0, 0, n, m, matrix, visited, result);
            return result;
        }

        private void traverse(int row, int col, int n, int m, int[][] matrix, boolean[][] visited, List<Integer> result) {
            if (row < 0 || row >= n || col < 0 || col >= m || visited[row][col]) {
                return;
            }

            visited[row][col] = true;
            result.add(matrix[row][col]);

            if (row + 1 >= n || visited[row + 1][col]) {
                traverse(row, col - 1, n, m, matrix, visited, result);
            }
            if (col - 1 < 0 || visited[row][col - 1]) {
                traverse(row - 1, col, n, m, matrix, visited, result);
            }
            
            traverse(row, col + 1, n, m, matrix, visited, result);
            traverse(row + 1, col, n, m, matrix, visited, result);
            traverse(row, col - 1, n, m, matrix, visited, result);
            traverse(row - 1, col, n, m, matrix, visited, result);
        }
}