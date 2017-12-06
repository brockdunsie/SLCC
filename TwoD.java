public class TwoD {
    private static int[][]timesTable = new int[12][12];

    public static void fillTable(){
        for(int row = 0; row<timesTable.length; row++)
        {
            for(int column = 0; column<timesTable.length; column++)
            {
                timesTable[row][column] = row* column;
            }
        }
    }
    public static void printTable(){
        for(int row = 0; row<timesTable.length; row++)
        {
            for(int column = 0; column<timesTable.length; column++)
            {
                System.out.print(timesTable[row][column] + "\t" );
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        fillTable();
        printTable();
    }
}
