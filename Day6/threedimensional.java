import java.util.Scanner;

class threedimensional {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = s.nextInt();

        int arr[][][] = new int[size][size][size];
        int num = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    arr[i][j][k] = num++;
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}