import java.util.Scanner;
class missingnumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int act=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            act+=a[i];
        }
        int exp=(n*(n+1))/2;
        System.out.println("Missing number is: "+(exp-act));
    }
}
