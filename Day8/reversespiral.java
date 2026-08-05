import java.util.Scanner;

class ReverseSpiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int no = sc.nextInt();

        int[][] matrix = new int[no][no];

        int num = 1;
        int top = 0;
        int bottom = no - 1;
        int left = 0;
        int right = no - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        System.out.println("\nReverse Spiral Matrix:");

        for (int r = no - 1; r >= 0; r--) {
            for (int c = no - 1; c >= 0; c--) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}