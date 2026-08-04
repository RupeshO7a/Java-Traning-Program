import java.util.Scanner;

class reversestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        char charcount[] = new char[128];
        int i;
        for (i = 0; i < name.length(); i++) {
            charcount[i] = name.charAt(i);
        }
        System.out.print("Reversed String: ");
        for (i = name.length() - 1; i >= 0; i--) {
            System.out.print(charcount[i]);
        }
    }
}