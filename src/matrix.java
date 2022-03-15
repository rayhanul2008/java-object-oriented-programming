public class matrix {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        int[][] n = {{1, 2}, {3, 4}, {5, 6}};
        if (m[0].length != n.length) {
            System.out.println("Multiplication undefined");
        } else {
            int[][] result = multiply(m, n);
            for(int row = 0; row < result.length; row++){
                for(int colum = 0; colum < result.length; colum++){
                    System.out.print(result[row][colum]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiply(int[][] m, int[][] n) {
        int[][] answer = new int[m.length][n[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int colum = 0; colum < n[0].length; colum++) {
                for (int i = 0; i < m[0].length; i++) answer[row][colum] += m[row][i] * n[i][colum];
            }
        }
        return answer;
    }
}
