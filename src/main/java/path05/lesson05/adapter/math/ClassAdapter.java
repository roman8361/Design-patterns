package path05.lesson05.adapter.math;

/**
 * ClassAdapter.
 *
 * @author Ilya_Sukhachev
 */
public class ClassAdapter extends MathHelper implements ITarget {
    @Override
    public int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
        var h1 = matrix1.length;
        var w1 = matrix1[0].length;

        var h2 = matrix2.length;
        var w2 = matrix2[0].length;

        var result = matrixMultiply(h1, w1, convert(matrix1), h2, w2, convert(matrix2));

        return new int[0][0];
    }


}
