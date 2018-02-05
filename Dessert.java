import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Dessert {
    public String flavors;
    public ArrayList<String> ingredients;
    public Dessert(){
        ingredients = new ArrayList<>();

    }
    public abstract void prepare();
    public abstract void create();
    public abstract String finish();
    public abstract void store();
    public ArrayList Ingredients(){
        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("In the order they are added, add the ingredient for your recipe or enter done to finish");
            choice = scan.nextLine();
            ingredients.add(choice);
        }while (!choice.equalsIgnoreCase("done"));
     return ingredients;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
