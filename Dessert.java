import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Dessert {
    protected ArrayList<String> ingredients;
    protected static ArrayList<Dessert> spread;
    protected static String flavor;
    public Dessert(String f){
        ingredients = new ArrayList<>();
        flavor = f;
        spread = new ArrayList<>();
    }
    public abstract void prepare();
    public abstract void create();
    public abstract void finish();
    public abstract void store();
    public ArrayList setIngredients(Dessert des){
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("In the order they are added, add the ingredient for your " + des + " or enter done to finish");
            choice = scan.nextLine();
            ingredients.add(choice);
        }while (!choice.equalsIgnoreCase("done"));
     return ingredients;
    }
    @Override
    public String toString() {
        return flavor + ingredients;
    }
}
