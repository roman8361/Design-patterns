package path05.lesson05.adapter.math;

/**
 * MathHelper.
 *
 * @author Ilya_Sukhachev
 */
public class MathHelper {

    public int[] matrixMultiply(int w1, int h1, int[] matrix1, int w2, int h2, int[] matrix2) {
        return new int[0];
    }

    public int[] vectorMultiply(int[] vector1, int[] vector2) {
        return new int[0];
    }

    int[] convert(int[][] matrix) {
        int newArray[] = new int[matrix.length * matrix[0].length];
        for (var i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (var j = 0; j < row.length; j++) {
                int number = matrix[i][j];
                newArray[i * row.length + j] = number;
            }
        }
        return newArray;
    }
}
