import java.util.Scanner;
public class Main{

    static int fact(int n){
        if(n==0)return 1;
        else{
            return (n * fact(n-1));
        }
    }

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter any number, I will give you a Factorial");

      int n = sc.nextInt();

      System.out.println("There are 2 Ways.\n1. with loop\n2. with recursive\nChoose any one");

      int op = sc.nextInt();
        int r=1;

      switch(op){

          case 1:
              while(n>0){
                  r = r*n;
                  n--;
              }
              System.out.println("It was easy, Factorial is "+r);
              break;

          case 2:
              System.out.println("It was not hard, Factorial is "+fact(n));
              break;
          default:
              System.out.println("Invalid option");
      }



    }

}