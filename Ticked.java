import java.util.Scanner;

public class Ticked {
    public static char[][] tac = new char[3][3];
    public static void tic() {
        for (char row = 0; row < tac.length; row++) {
            for (char column = 0; column < tac[row].length; column++) {
                tac[row][column] = '_';
            }
         }
        }
//  public static boolean fin(){
////            if (tac[0][0] = 1  && tac[1][1]= 1) {
////
////            }
//        }
    public static void draw(){
        System.out.println("\t");
        for (char row = 0; row < tac.length; row++) {
            for (char column = 0; column < tac[row].length; column++) {
                 System.out.print(tac[row][column] + "  ");
            }
            System.out.println("");
        }
    }
    public static String pe(){
        String p1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Enter your placeholder");
        p1 = scan.next();
        return p1;
    }
    public static String pew(){
        String p2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 2: Enter your place");
        p2 = scan.next();
        return p2;
    }
    public static void turn(String p4, String p5) {
        int x = 0;
        Character p1 = p4.charAt(0);
        Character p2 = p5.charAt(0);
        String choice;
        Scanner scan = new Scanner(System.in);
        if (x == 0) {
            System.out.println("Choose a position for your " + p1);
            choice = scan.next();
            if(choice.equals("tl"))
            {
                tac[0][0] = p1;
            }
            else if(choice.equals("tm"))
            {
                tac[0][1] = p1;
            }
            else if(choice.equals("tr"))
            {
                tac[0][2] = p1;
            }
            else if(choice.equals("ml"))
            {
                tac[1][0] = p1;
            }
            else if(choice.equals("c"))
            {
                tac[1][1] = p1;
            }
            else if(choice.equals("mr"))
            {
                tac[1][2] = p1;
            }
            else if(choice.equals("bl"))
            {
                tac[2][0] = p1;
            }
            else if(choice.equals("bm"))
            {
                tac[2][1] = p1;
            }
            else if(choice.equals("br"))
            {
                tac[2][2] = p1;
            }
            x = 1;
        }
        else if(x==1){
            System.out.println("Choose a position for your " + p2);
            choice = scan.next();
            if(choice.equals("tl"))
            {
                tac[0][0] = p2;
            }
            else if(choice.equals("tm"))
            {
                tac[0][1] = p2;
            }
            else if(choice.equals("tr"))
            {
                tac[0][2] = p2;
            }
            else if(choice.equals("ml"))
            {
                tac[1][0] = p2;
            }
            else if(choice.equals("c"))
            {
                tac[1][1] = p2;
            }
            else if(choice.equals("mr"))
            {
                tac[1][2] = p2;
            }
            else if(choice.equals("bl"))
            {
                tac[2][0] = p2;
            }
            else if(choice.equals("bm"))
            {
                tac[2][1] = p2;
            }
            else if(choice.equals("br"))
            {
                tac[2][2] = p2;
            }
            x=0;
        }
    }
    public static void checkForWinner(){
    }
    public static void main (String[]args)
    {

        System.out.println("Welcome to tic-tac-toe!");
        tic();
        draw();
        boolean w=false;
        System.out.println("Positions are tl for Top Left, ml for Middle Left, bl for Bottom Left, and c for center and so forth ");
        do {
            turn(pe(),pew());
            draw();

        }
        while(w!=true);
    }
}
