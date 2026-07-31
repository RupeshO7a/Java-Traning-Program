import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int s = 1; s <= a - i; s++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                if (j != i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}