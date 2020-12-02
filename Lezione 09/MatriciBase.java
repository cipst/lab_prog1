public class MatriciBase {

    public static void main(String[] args) {
        final int[][] mat1 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

        int[][] mat2 = new int[11][11];
        for (int i = 1; i < mat2.length; i++) {
            for (int j = 1; j < mat2[i].length; j++) {
                mat2[i][j] = i * j;
                System.out.format("%4d", mat2[i][j]);
            }
            System.out.println();
        }

        int[][] mat3 = new int[8][8];
        mat3[0] = new int[] { 8, 3, 2, 4, 1, 6, 9, 1 };


        System.out.println("\n--------------------");

        for (int i = 1; i < mat3.length; i++) {
            mat3[i] = new int[mat3.length - i];
            for (int j = 0; j < mat3.length - i; j++) {
                mat3[i][j] = mat3[i - 1][j] + mat3[i - 1][j + 1];
            }
        }

        ArrayDiArrays.stampaMatrice(mat3);
    }// main
}// class