import java.util.Scanner;

class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        char[] arr = str.toCharArray();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                arr[index++] = arr[i];
            }
        }

        System.out.print("String after removing duplicate characters: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
    }
}