import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dessert {
    public String flavors;
    public ArrayList<String> ingredients;
    public Dessert(){


    }
    public void prepare(){

    }
    public void create(){

    }
    public String finish(){
        return flavors;
    }
    public void store(String storage){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Fridge.txt"));
            writer.write(storage);
            writer.close();
        }
        catch (IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
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
