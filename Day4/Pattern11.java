import java.util.Scanner;

class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        // Upper part
        for (int i = 1; i <= no; i++) {

            // Spaces
            for (int s = i; s < no; s++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = no - 1; i >= 1; i--) {

            // Spaces
            for (int s = i; s < no; s++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}