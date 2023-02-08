import java.util.Scanner;
public class Main{

     public static int fact(int n){

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

                System.out.println("Not Hard, Factorial of " + a + " is " + r);
                break;

            case 2:
                System.out.printf("Enter any number, you will get Factorial: ");
                int n1 = sc.nextInt();
                System.out.println("Not hard, Factorial of " + n1 + " is " + fact(n1));
                break;
        }

    }


     public static int summ(int n){

        if(n==0) return 0;
        else{
            return (n+summ(n-1));
        }
    }
     public static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("There are two ways:");
        System.out.println("1. With Loop");
        System.out.println("2. With Recursion");
        System.out.printf("Select any one from above: ");
        int op = sc.nextInt();

        switch(op){
            case 1:
                System.out.printf("Enter any number, you will get sum till 0: ");
                int n = sc.nextInt();
                int a=n;
                int r = 0;
                while(n>0){
                    r=r+n;
                    n--;
                }

                System.out.println("Not Hard, Sum of first " + a + " is " + r);
                break;

            case 2:
                System.out.printf("Enter any number, you will get Sum till 0: ");
                int n1 = sc.nextInt();
                System.out.println("Not hard, sum  of first " + n1 + " is " + summ(n1));
                break;
        }

    }


     public static void rev(){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter any number: ");
        int n = sc.nextInt();
        int c = 10;
        int res=0;

        for(i=0; i< ; i++){
            int temp = n%c;
            temp = temp*(c/10);
            res = res+temp;
            c=c*10;
            n=n-temp;
        }


        System.out.println("Not Hard, Reverse of " + n + " is " + c);
    }


     public static void sumoe(){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter how many number: ");
        int n = sc.nextInt();

       int odd = 0;
       int even = 0;
       int flag = 0;

       for(int i=0;i<n;i++){
           System.out.printf("Enter " + (i+1) + " number: ");
           int num = sc.nextInt();
           if(num%2==0){
               even = even + num;
           }
           else{
               odd = odd + num;
           }
       }

        System.out.println("sum of odd = " + odd + " and sum of even = " + even);

    }


     public static void untiln(){
        int i=0;
        int sum = 0;
        while(i>=0){

            Scanner sc = new Scanner(System.in);

            System.out.printf("Enter number: ");
            int n =  sc.nextInt();
            if(n<0) break;
            sum = sum + n;
        }
        System.out.println("sum  of all is " + sum);
    }

     public static void rev1to7(){
         for(int i=7;i>0;i--){
             System.out.println(i);
         }
     }

     public static void diagStar(){
         System.out.println("How many number of rows and column?: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.printf(" * ");
             }
             System.out.printf("\n");
         }
     }

    public static void decStar(){
        System.out.println("How many number of rows and column?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.printf(" * ");

            }
            System.out.printf("\n");
        }
    }

    public static void incStar(){
        System.out.println("How many number of rows and column?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.printf(" * ");

            }
            System.out.printf("\n");
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
        System.out.println("6. Reverse of 1 to 7");
        System.out.println("7. Diagnol Star Pattern");
        System.out.println("8. Decreasing Star Pattern");
        System.out.println("9. Increasing Star Pattern");
        System.out.printf("Choose from above: ");
        int op = sc.nextInt();


        switch(op){
            case 1:
                factorial();
                break;

            case 2:
                sum();
                break;

            case 3:
                rev();
                break;

            case 4:
                sumoe();
                break;

            case 5:
                untiln();
                break;

            case 6:
                rev1to7();
                break;

            case 7:
                diagStar();
                break;

            case 8:
                decStar();
                break;

            case 9:
                incStar();
                break;


            default:
                System.out.printf("Invalid option. Try again!");
        }





    }
}