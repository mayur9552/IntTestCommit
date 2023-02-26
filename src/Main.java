import java.util.Scanner;
public class Main{
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int fact(int n){
        if(n==0) return 1;
        else{
            return (n*fact(n-1));
        }
    }

     public static void factorial(int op,int n){

        switch(op){
            case 1:
                int a=n;
                int r = 1;
                while(n>0){
                    r=r*n;
                    n--;
                }
                System.out.println("Not Hard, Factorial of " + a + " is " + r);
                break;

            case 2:
                System.out.println("Not hard, Factorial of " + n + " is " + fact(n));
                break;
        }
    }


     public static int summ(int a){
        if(a==0) return 0;
        else{
            return (a+summ(a-1));
        }
    }
     public static void sum(int opt1, int a){
        switch(opt1){
            case 1:
                int x=a;
                int r = 0;
                while(a>0){
                    r=r+a;
                    a--;
                }
                System.out.println("Not Hard, Sum of first " + x + " is " + r);
                break;

            case 2:
                System.out.println("Not hard, sum  of first " + a + " is " + summ(a));
                break;
        }

    }


     public static void rev(int num){
        int n = num;
        int res=0;
        while(n!=0){
           res = res*10 + n%10;
           n = n/10;
        }
        System.out.println("Not Hard, Reverse of " + num + " is " + res);
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
         Scanner sc = new Scanner(System.in);
        int i=0;
        int sum = 0;
        do{
            sum=sum+i;
            System.out.printf("Enter number: ");
            i =  sc.nextInt();
        }while(i>=0);
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

    public static void findLargestString(){
        System.out.println("Enter Paragraph: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

      String[] splitedString = s.split(" ");
       String max = "";

       for(int i=0 ; i<splitedString.length ; i++){
           if(max.length()<splitedString[i].length()) max=splitedString[i];
       }
        System.out.println("Largest String is: " + max);
    };


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int op=1;
         do {
             clearScreen();
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
             System.out.println("10. Find the largest String from the paragraph");
             System.out.println("0. Exit");
             System.out.printf("Choose from above: ");
             op = sc.nextInt();

             switch (op) {
                 case 1:
                     System.out.println("There are two ways:");
                     System.out.println("1. With Loop");
                     System.out.println("2. With Recursion");
                     System.out.printf("Select any one from above: ");
                     int opt = sc.nextInt();
                     System.out.printf("Enter any number, you will get Factorial: ");
                     int n = sc.nextInt();
                     factorial(opt, n);
                     break;

                 case 2:

                     System.out.println("There are two ways:");
                     System.out.println("1. With Loop");
                     System.out.println("2. With Recursion");
                     System.out.printf("Select any one from above: ");
                     int opt1 = sc.nextInt();
                     System.out.printf("Enter any number, you will get sum till 0: ");
                     int a = sc.nextInt();
                     sum(opt1, a);
                     break;

                 case 3:
                     System.out.printf("Enter any number: ");
                     int num = sc.nextInt();
                     rev(num);
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

                 case 10:
                     findLargestString();
                     break;

                 default:
                     System.out.printf("Invalid option. Try again!");
             }
         }while(op!=0);
     }
}