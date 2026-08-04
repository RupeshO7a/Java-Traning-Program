import java.util.Scanner;

class duplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        int charcount[] = new int[128];
        int dup = 0;

        for (char c : str.toCharArray()) {
            charcount[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (charcount[i] > 1) {
                dup++;
            }
        }

        System.out.println("Number of duplicate characters: " + dup);
    }
}