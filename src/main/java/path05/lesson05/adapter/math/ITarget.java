package path05.lesson05.adapter.math;

/**
 * ITarget.
 *
 * @author Ilya_Sukhachev
 */
public interface ITarget {

    int[][] matrixMultiply(int[][] matrix1, int[][] matrix2);
    int[] vectorMultiply(int[] vector1, int[] vector2);
}
