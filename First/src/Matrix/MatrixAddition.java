package Matrix;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {3, 4, 5}};
        int[][] arr2 = {{1, 2, 3}, {3, 4, 5}};
        addAndPrintMatrix(arr1, arr2);

    }

    public static void addAndPrintMatrix(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

}
