public class Pie extends Dessert {
    public String flavor;
    public boolean isHot;
    public Pie(String f,int temp){
        super(f);
        if(temp<85){
            isHot = false;
        }
        else{
            isHot = true;
        }
    }
    public void prepare(){
        System.out.println("Get your ingredients together, get out a pie tin , and preheat your oven to desired temperature. ");
    }
    public void create(){
        System.out.println("Make a crust with your dough in the tin, mix ingredients, pour into tin, and put in oven.");
    }
    public void finish(){
        System.out.println("Take out of oven");
    }
    public void store(){
        System.out.println("Store in fridge");
    }
    @Override
    public String toString() {
        return super.toString() + " it is " + isHot +" that it is hot";
    }
}
