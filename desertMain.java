import java.util.ArrayList;

public class desertMain{

    public static void main(String[]args)
    {
        ArrayList<Dessert> Fridge = new ArrayList<>();
        Fridge.add(new Cake("Short Cake", false));
        Fridge.add(new Cookie("Chocolate Chip", true));
        Fridge.add(new Pie("Pumpkin", 35));
        Fridge.add(new IceCream("Cookie Dough", "Cookie Dough"));
        for (Dessert d:Fridge)
        {
            d.setIngredients(d);
            d.prepare();
            d.create();
            d.finish();
            d.store();
            System.out.println(d.ingredients);
            System.out.println("/n");
            System.out.println(d);
        }
    }
}
