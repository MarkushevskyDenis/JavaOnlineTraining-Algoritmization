package by.jonline.grow.algoritmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * .  .   .  .   .
 * .  .   .   .  .
 * .  .   .    . .
 * n n-1 n-2 ... 1
 */

public class ArrOfArr4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i % 2 == 0) {
                    arr[i][j] = j + 1;
                } else {
                    arr[i][j] = n - j;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

