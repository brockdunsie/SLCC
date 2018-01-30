public class Cookie extends Dessert {
    public String flavor;
    public Cookie(){

    }
    @Override
    public void prepare(){

    }
    @Override
    public void create(){

    }
    @Override
    public String finish(){
        flavor = "What is the name of your cookie?";
        return flavor;
    }
}
