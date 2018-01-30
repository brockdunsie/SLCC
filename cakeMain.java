public class cakeMain extends Cake{
    public static void main(String[]args)
    {
        Cake cake = new Cake();
        String flavor = cake.finish();
        cake.store(flavor);
    }
}
