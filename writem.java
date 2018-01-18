import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;

public class writem {
    public static void writeToFile()
    {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("truth.txt"));
            writer.write("Spartan Spar \r\n");
            writer.write("Sick as frick\r\n");
            writer.write("Once upon a time \r\n");
            writer.write("Ryan is a babe\r\n");
            writer.write("You better not say that. Don't be innapropriate!\r\n");
            writer.close();
        }
        catch (IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    public static void readFromFile()
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("truth.txt"));
            String line = null;
            do {
                line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            }
            while(line!=null);
            }
        catch (IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }

    }
    public static void printArray(ArrayList<String> theList)
    {
        for(String s: theList)
        {
            System.out.println(s);
        }
    }
    public static void filetoArray(ArrayList<String> list)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("truth.txt"));
            String line = null;
            do{
                line = reader.readLine();
                if(line!= null)
                    list.add(line);
            }while (line != null);
            reader.close();
        }catch (IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    public static void arrayToFile(ArrayList<String> theList)
    {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("truth.txt"));
            for(int i = 0; i<theList.size(); i ++)
            {
                writer.write(theList.get(i) + "\r\n");
            }
        }catch (IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    public static void saveData() {
        try {
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("info.txt"));
            dataOut.writeInt(69);
            dataOut.writeDouble(6.9);
            dataOut.writeBoolean(true);
            dataOut.close();
        }catch (IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public static void readData()
    {
        try {
            DataInputStream dataIn = new DataInputStream(new FileInputStream("info.txt"));
            int i = dataIn.readInt();
            double d = dataIn.readDouble();
            boolean b = dataIn.readBoolean();
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);

            dataIn.close();
        }catch (IOException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
public static void main (String[]args)
{
    writeToFile();
    ArrayList<String>theList = new ArrayList<String>();
    filetoArray(theList);
    printArray(theList);
    arrayToFile(theList);
    readFromFile();
    saveData();
    readData();
}
}
