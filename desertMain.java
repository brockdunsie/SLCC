import java.util.ArrayList;

public class desertMain{
    public static void main(String[]args)
    {
        ArrayList<Dessert> Fridge = new ArrayList<>();
        Fridge.add(new Cake());
        Fridge.add(new Cookie());
        Fridge.add(new Pie());
        Fridge.add(new IceCream());
        for (Dessert d:Fridge)
        {
            d.prepare();
            d.create();
            d.finish();
            d.store();
        }
    }
}
