import java.util.Random;
public class sales {
    public static void main(String[]args) {
        Random r = new Random();
        double[] sales = new double[7];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = (r.nextDouble()*300)-10;
            System.out.println(sales[i] + " was the sales on this day");
        }
    }
}
