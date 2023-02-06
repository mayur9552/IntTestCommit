import java.util.Scanner;




public class Main{

    Scanner sc = new Scanner(System.in);
    public static int fact(int n){
        Scanner sc = new Scanner(System.in);
        if(n==0) return 1;
        else{
            return (n*fact(n-1));
        }
    }

     public static void factorial(){
         Scanner sc = new Scanner(System.in);

        System.out.println("There are two ways:");
        System.out.println("1. With Loop");
        System.out.println("2. With Recursion");
        System.out.printf("Select any one from above: ");
        int op = sc.nextInt();

        switch(op){
            case 1:
                System.out.printf("Enter any number, you will get Factorial: ");
                int n = sc.nextInt();
                int a=n;
                int r = 1;
                while(n>0){
                    r=r*n;
                    n--;
                }

                System.out.println("Very Easy, Factorial of " + a + " is " + r);
                break;


            case 2:
                System.out.printf("Enter any number, you will get Factorial: ");
                int n1 = sc.nextInt();
                System.out.println("Not hard, Factorial of " + n1 + " is " + fact(n1));
                break;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Assignment\n");
        System.out.println("1. factorial");
        System.out.println("2. Sum of first N number");
        System.out.println("3. Digits in Reversed");
        System.out.println("4. Sum of even and odd numbers");
        System.out.println("5. Until negative, sum of all");
        System.out.printf("Choose from above: ");
        int op = sc.nextInt();


        switch(op){
            case 1:
                factorial();


                break;



            default:
                System.out.printf("Invalid option. Try again!");
        }





    }
}