import java.util.Scanner;
class Pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int n = 65;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)n++ +" ");
            }
            System.out.println();
        }
    }
}