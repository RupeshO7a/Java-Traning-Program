import java.util.Scanner;

class dimesionaladd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter: ");
        int size = s.nextInt();

        int a[][][] = new int[size][size][size];
        int b[][][] = new int[size][size][size];
        int c[][][] = new int[size][size][size];

        int n = 10;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    a[i][j][k] = n++;
                    b[i][j][k] = a[i][j][k] + a[i][j][k];
                    c[i][j][k] = a[i][j][k] + b[i][j][k];
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}