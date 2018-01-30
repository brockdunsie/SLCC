public class IceCream extends Dessert {
    public String flavor;
    public IceCream(){

    }
    @Override
    public void prepare(){

    }
    @Override
    public void create(){

    }
    @Override
    public String finish(){
        flavor = "What is the name of your ice cream?";
        return flavor;
    }
}
