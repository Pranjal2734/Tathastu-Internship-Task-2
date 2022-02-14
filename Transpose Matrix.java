public class Main {

    public static void main(String[] args) {
        int r = 2, c = 3;
        int[][] matrix = { {7 , 4 , 9}, {2 , 8, 1} };

        display(matrix);
        int[][] transpose = new int[c][r];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] r : matrix) {
            for (int c : r) {
                System.out.print(c + "    ");
            }
            System.out.println();
        }
    }
}