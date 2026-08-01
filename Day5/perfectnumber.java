import java.util.Scanner;

class perfectnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        int sum = 0;

        if (no < 1) {
            System.out.println("Not a Perfect Number");
        } else {
            for (int i = 1; i < no; i++) {
                if (no % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == no) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not a Perfect Number");
            }
        }
    }
}