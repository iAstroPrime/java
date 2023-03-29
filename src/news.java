
import java.util.Scanner;

public class news {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("This is a command line calculator");
        System.out.println("Enter for add = a, sub = s, multi = m, div = d ");
        char cal = su.next().charAt(0);
        switch (cal){
            case 'a' :
                System.out.println("Find sum of two number");
                System.out.println("Enter a");
                int a = su.nextInt();
                System.out.println("Enter b");
                int b = su.nextInt();
                System.out.printf("a + b = %d",a+b );
                break;

            case 's' :
                System.out.println("Find sub of two number");
                System.out.println("Enter a");
                a = su.nextInt();
                System.out.println("Enter b");
                b = su.nextInt();
                System.out.printf("a - b = %d",a-b );
                break;
            case 'm' :
                System.out.println("Find multi of two number");
                System.out.println("Enter a");
                a = su.nextInt();
                System.out.println("Enter b");
                b = su.nextInt();
                System.out.printf("a * b = %d",a*b );
                break;
            case 'd' :
                System.out.println("Find div of two number");
                System.out.println("Enter a");
                a = su.nextInt();
                System.out.println("Enter b");
                b = su.nextInt();
                System.out.printf("a / b = %d",a/b );
                break;
            default:
                System.out.println("Please enter write input");
        }

    }
}
