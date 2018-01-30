public class Pie extends Dessert {
    public String flavor;
    public Pie(){

    }
    @Override
    public void prepare(){

    }
    @Override
    public void create(){

    }
    @Override
    public String finish(){
        flavor = "What is the name of your pie?";
        return flavor;
    }
}
