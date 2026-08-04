import java.util.Scanner;

class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        int u = 0, l = 0, n = 0, sym = 0, sp = 0;

        for (char c : name.toCharArray()) {
            if (Character.isUpperCase(c)) {
                u++;
            } else if (Character.isLowerCase(c)) {
                l++;
            } else if (Character.isDigit(c)) {
                n++;
            } else if (Character.isSpaceChar(c)) {
                sp++;
            } else {
                sym++;
            }
        }
        System.out.println("Uppercase: " + u);
        System.out.println("Lowercase: " + l);
        System.out.println("Digits: " + n);
        System.out.println("Spaces: " + sp);
        System.out.println("Symbols: " + sym);
        sc.close();
    }
}