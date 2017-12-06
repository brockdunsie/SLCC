import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Ipod {
    private ArrayList<Song> songlist;
    public Ipod()
    {
        songlist = new ArrayList<Song>();
        songlist.add(new Song());
    }

    public void printSong() {
        for (Song s : songlist) {
            toString();
        }
    }

    public void addSongs() {
        Scanner scan = new Scanner(System.in);
        String quit = "";
        do {
            String sname = scan.nextLine();
            System.out.println("Enter the name of the song");
            String sartist = scan.nextLine();
            System.out.println("Enter the name of the song's artist");
            String sgenre = scan.nextLine();
            System.out.println("Enter the song's genre");
            songlist.add(sname, sartist, sgenre);
            quit = scan.nextLine();
            System.out.println("Enter yes to enter another song or Enter no to exit");
        }
        while (quit != "no");
    }

    public static void main(String[] args)
    {
        Ipod song = new Ipod();
        song.addSongs();
        song.printSong();
    }
}
