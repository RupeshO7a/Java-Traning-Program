import java.util.Scanner;

class MatrixArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {1*1, 2*1, 3*1, 4*1},
            {1*2, 2*2, 3*2, 4*2},
            {1*3, 2*3, 3*3, 4*3},
            {1*5, 2*5, 3*5, 4*5}
        };

        System.out.println(arr[1][1]);
    }
}