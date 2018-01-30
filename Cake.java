public class Cake extends Dessert {
    public String flavor;
    public Cake(){

    }
    @Override
    public void prepare(){

    }
    @Override
    public void create(){

    }
    @Override
    public String finish(){
        flavor = "What is the name of your cake?";
        return flavor;
    }

}
