import java.util.Scanner;

class ReverseSpiral2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int row = n / 2;
        int col = n / 2;

        matrix[row][col] = 1;

        int num = 2;
        int step = 1;

        while (num <= n * n) {
            for (int i = 0; i < step && num <= n * n; i++) {
                row++;
                matrix[row][col] = num++;
            }
            for (int i = 0; i < step && num <= n * n; i++) {
                col--;
                matrix[row][col] = num++;
            }

            step++;
            for (int i = 0; i < step && num <= n * n; i++) {
                row--;
                matrix[row][col] = num++;
            }
            for (int i = 0; i < step && num <= n * n; i++) {
                col++;
                matrix[row][col] = num++;
            }

            step++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}