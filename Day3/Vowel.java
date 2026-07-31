import java.util.Scanner;
class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:- ");
        char c = sc.next().charAt(0);
        // if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        //     System.out.println(c+" is a vowel");
        // }
        // else{
        //     System.out.println(c+" is not a vowel");
        // }
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':   
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c+" is a vowel");
                break;
            default:
                System.out.println(c+" is not a vowel");
        }

        // switch(c){
        //     case 'a':
        //         System.out.println(c+" is a vowel");
        //         break;
        //     case 'e':
        //         System.out.println(c+" is a vowel");
        //         break;
        //     case 'i':
        //         System.out.println(c+" is a vowel");
        //         break;
        //     case 'o':
        //         System.out.println(c+" is a vowel");
        //         break;
        //     case 'u':
        //         System.out.println(c+" is a vowel");
        //         break;
        //     default:
        //         System.out.println(c+" is not a vowel");
        // }
    }
}