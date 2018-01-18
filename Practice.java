import java.util.Scanner;

public class Practice {
    static int a, b, x, i;
    static int d = 0;
    public static void rectang(int a, int b){
        a = a-1;
        b = b-1;
        for (int i = 0; i <= a ; i += 1)
        {
            for (int x = 0; x <=b; x +=1 ) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void tri(int c){
        for (int i = 0; i <= c; i +=1)
        {
            for (int j = 0; j<i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void outline(int a, int b){
        for (int i = 0; i<a; i++)
        {
            if (i == 0)
            {
                for (int j = 0; j<=b; j++)
                {
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            else if (i == a-1)
            {
                for (int j = 0; j<=b; j++)
                {
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            else
            {
                System.out.print("* ");
                for (int j = 0; j<b-1; j++)
                {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many columns");
        String holder = scan.nextLine();
        a = Integer.parseInt(holder);
        System.out.println("How many rows");
        String holde = scan.nextLine();
        b = Integer.parseInt(holde);
        outline(a,b);
//        rectang(a,b);
//        System.out.println("How many rows");
//        String held = scan.nextLine();
//        int c = Integer.parseInt(held);
//        tri(c);

    }
}
