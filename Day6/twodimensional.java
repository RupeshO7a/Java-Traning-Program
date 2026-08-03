import java.util.Scanner;

class twodimensional {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = s.nextInt();

        int arr[][] = new int[size][size]; // 2D array
        int num = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // correct System
        }
    }
}