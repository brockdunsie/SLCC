public class Cookie extends Dessert {
    public String flavor;
    public boolean isFrozen;
    public Cookie(String f, boolean isFrozen){
        super(f);
    }
    public void prepare(){
        System.out.println("Get your ingredients together, get a pan out, and preheat oven to desired temperature");
    }
    public void create(){
        System.out.println("Mix ingredients together, pour into small circles on pan, and put in oven.");
    }
    public void finish(){
        System.out.println("Take out of oven");
    }
    public void store(){
        System.out.println("Store in fridge");
    }
    @Override
    public String toString() {
        return super.toString() + " it is " + isFrozen + " that it is frozen.";
    }
}
