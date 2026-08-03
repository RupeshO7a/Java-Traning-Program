import java.util.Scanner;
class nameformatter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.next();
        char c[] = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            System.out.print(c[i] + "*");
        }
    }
}