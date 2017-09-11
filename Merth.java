import java.util.Scanner;
public class Merth {
    public static void treeHeight()
    {
        System.out.println("Enter ladder length ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();//Hypotenuse
        System.out.println("Enter the distance from ladder to tree");
        int y = input.nextInt();//Length
        int z = x*x-y*y;
        double h = (Math.sqrt(z));//Answer
        System.out.println("The cat is " + h + " feet high");
    }
    public static void house()
    {
        System.out.println("Enter principle amount:");
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();//Principle
        System.out.println("Enter the interest rate:");
        double r = scan.nextInt();//Monthly Payments
        System.out.println("Enter how many payments that will be made (Years*");
        int n = scan.nextInt(); //Payment total
        S
    }
    public static void main(String[]args) {
        System.out.println("Enter the number you'd like: \n 1. How high up a cat is? \n 2. Your monthly payment on a house?");
        Scanner choice = new Scanner(System.in);
        if (choice == 1) {
            treeHeight();
        }
        else if (choice == 2) {
            house();
        }
        else{
            System.out.println("Invalid");
        }
    }
}
