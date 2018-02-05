public class IceCream extends Dessert {
    public String flavor, mian;
    public IceCream(String f, String mainIngredient){
        super(f);
        mian = mainIngredient;
    }
    public void prepare(){
        System.out.println("Get your ingredients out and get out a mixing board");

    }
    public void create(){
        System.out.println("Mix your ingredients together and freeze");
    }
    public void finish(){
        System.out.println("Take out of freezer");
    }
    public void store(){
        System.out.println("Store in freezer");
    }
    @Override
    public String toString() {
        return super.toString() + " it is full of " + mian + "s";
    }
}
