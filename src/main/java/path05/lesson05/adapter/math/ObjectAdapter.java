package path05.lesson05.adapter.math;

/**
 * ObjectAdapter.
 *
 * @author Ilya_Sukhachev
 */
public class ObjectAdapter implements ITarget {

    private MathHelper mathHelper;

    public ObjectAdapter(MathHelper mathHelper) {
        this.mathHelper = mathHelper;
    }

    @Override
    public int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) {
        var h1 = matrix1.length;
        var w1 = matrix1[0].length;

        var h2 = matrix2.length;
        var w2 = matrix2[0].length;

        var result = mathHelper.matrixMultiply(h1, w1, mathHelper.convert(matrix1), h2, w2, mathHelper.convert(matrix2));

        return new int[0][0];
    }

    @Override
    public int[] vectorMultiply(int[] vector1, int[] vector2) {
        return mathHelper.vectorMultiply(vector1, vector2);
    }
}
