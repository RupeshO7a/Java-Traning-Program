import java.util.Arrays;
import java.util.Scanner;

class arraysimilarity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

        int a1[] = new int[n];
        int a2[] = new int[n];

        System.out.println("Enter first array elements: ");
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter second array elements: ");
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }

        int flag = 0;

        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < n; i++) {
            if (a1[i] != a2[i]) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Arrays are similar");
        } else {
            System.out.println("Arrays are not similar");
        }
    }
}