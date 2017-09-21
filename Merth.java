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
        System.out.println("Enter how payments you make per year:");
        int a = scan.nextInt(); //Yearly amount of payments
        total(p,r,n,a);
    }
     
    public static void total(int p, double r, int n, int a)
    {
        double totes = p * Math.pow(Math.E, r * 12) / a;
        System.out.println("The total is " + totes);
    }
    public static void money()
    {
        System.out.println("Enter an amount of money:");
        Scanner scern = new Scanner(System.in);
        int x = scern.nextInt();
        int quarter = x/25;
        System.out.println("Quarters: " + quarter);
        x = x%25;
        int dime = x/10;
        System.out.println("Dimes: " + dime);
        x = x%10;
        int nickel = x/5;
        System.out.println("Nickels: " + nickel);
        x = x%5;
        int penny = x;
        System.out.println("Pennies: " +penny);
    }
    public static void profit() {
        System.out.println("Enter number of items sold:");
        Scanner scan = new Scanner(System.in);
        int numItems = scan.nextInt();
        System.out.println("Enter the item's price:");
        double salesPrice = scan.nextDouble();
        System.out.println("Enter the cost to make the items;");
        double itemCost = scan.nextDouble();
        System.out.println("Enter the number of items made:");
        int numMade = scan.nextInt();
        getProfit(numItems, salesPrice,  itemCost, numMade);
    }
    public static void getProfit(int numItems, double salesPrice, double itemCost, int numMade) {
        {
        double gross = salesPrice * numItems;
        double cost = itemCost * numMade;
        double profit = gross - cost;
        System.out.println("The total profit is: " + profit);
}
    }
    public static void main(String[]args) {
        System.out.println("Enter the number you'd like: \n 1. How high up a cat is? \n 2. Your monthly payment on a house?");
        System.out.println("Enter the number you'd like: \n 1. How high up a cat is in a tree? \n 2. Your monthly payment on a house? \n 3. How many of each coin makes up your cash amount? \n 4. Total profit on an item?");
        Scanner choice = new Scanner(System.in);
        int answer = choice.nextInt();
        if (answer == 1) {
            treeHeight();
        }
        else if (answer == 2) {
            house();
        }
        else if (answer == 3) {
            money();
        }
        else if (answer == 4) {
            profit();

        }
        else{
            System.out.println("Invalid");
       }
    }
}