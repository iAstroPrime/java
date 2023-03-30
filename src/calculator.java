
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("******A command line calculator by Gagan Ft.Astro******\n");
        System.out.println("\t\t\tChoose One of It...\nA/a=Addition   \t    S/s=Subtract\nM/m=Multiplication \tD/d=Division ");
        char cal = su.next().charAt(0);
        switch (cal){
            case 'a' :
                System.out.println("*****Addition Operation*****\n");
                System.out.println("Enter The First Number");
                int a = su.nextInt();
                System.out.println("Enter The Second Number");
                int b = su.nextInt();
                System.out.printf("%d + %d = %d",a,b,a+b );
                break;

            case 's' :
                System.out.println("*****Subtraction Operation*****\n");
                System.out.println("Enter The First Number");
                a = su.nextInt();
                System.out.println("Enter The Subtractor");
                b = su.nextInt();
                System.out.printf("%d - %d = %d",a,b,a-b );
                break;
            case 'm' :
                System.out.println("*****Multiplication Operation*****\n");
                System.out.println("Enter The First Number");
                a = su.nextInt();
                System.out.println("Enter The Multiplier");
                b = su.nextInt();
                System.out.printf("%d * %d = %d",a,b,a*b );
                break;
            case 'd' :
                System.out.println("*****Division Operation*****\n");
                System.out.println("Enter The Numerator");
                a = su.nextInt();
                System.out.println("Enter the Denominator");
                b = su.nextInt();
                System.out.printf("%d / %d = %d",a,b,a/b );
                break;
            case 'A' :
                System.out.println("*****Addition Operation*****\n");
                System.out.println("Enter The First Number");
                int c = su.nextInt();
                System.out.println("Enter The Second Number");
                int d = su.nextInt();
                System.out.printf("%d + %d = %d",c,d,c+d );
                break;

            case 'S' :
                System.out.println("*****Subtraction Operation*****\n");
                System.out.println("Enter The First Number");
                a = su.nextInt();
                System.out.println("Enter The Subtractor");
                b = su.nextInt();
                System.out.printf("%d - %d = %d",a,b,a-b );
                break;
            case 'M' :
                System.out.println("*****Multiplication Operation*****\n");
                System.out.println("Enter The First Number");
                a = su.nextInt();
                System.out.println("Enter The Multiplier");
                b = su.nextInt();
                System.out.printf("%d * %d = %d",a,b,a*b );
                break;
            case 'D' :
                System.out.println("*****Division Operation*****\n");
                System.out.println("Enter The Numerator");
                a = su.nextInt();
                System.out.println("Enter the Denominator");
                b = su.nextInt();
                System.out.printf("%d / %d = %d",a,b,a/b );
                break;
            default:
                System.out.println("Please enter write input");
        }

    }
}
