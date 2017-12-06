import java.util.Random;
public class sales {
    double[] sales;
    public sales() {
        Random r = new Random();
        sales = new double[7];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = (r.nextDouble() * 300) - 10;
            System.out.println(sales[i] + " was the sales on this day");
        }
        System.out.println(findMax(sales) + " was the max amount");
        System.out.println(findMin(sales) + " was the least amount");

    }

    public double findMax(double[] g)
    {
        double max = 0;
        for(int i = 0; i < g.length; i++){
            if(g[i]> max){
               max= g[i];
            }
        }
        return max;
    }
    public double findMin(double[] g)
    {
        double min = 500;
        for(int i = 0; i < g.length; i++){
            if(g[i]< min){
                min= g[i];
            }
        }
        return min;
    }
    public static void main(String[]args) {
        new sales();
    }
}
