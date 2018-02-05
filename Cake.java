import java.util.Scanner;

public class Cake extends Dessert {
    public String flavor;
    public boolean isFrosted;
    public Cake(String f, boolean isFrosted){
        super(f);

    }

    public void prepare(){
        System.out.println("Get your ingredients together, get out a pan, and preheat your oven to desired temperature. ");
    }
    public void create(){
        System.out.println("Mix your ingredients together, pour into pan, put in oven for desired amount of time, and wait");
    }
    public void finish(){
        System.out.println("Take out of oven");
    }
    public void store(){
        System.out.println("Put in fridge");
    }
    @Override
    public String toString() {
        return super.toString() + " it is " + isFrosted + " that it is frosted";
    }

}
