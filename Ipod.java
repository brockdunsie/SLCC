import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Ipod {
    private ArrayList<Song> songlist;
    public Ipod()
    {
        songlist = new ArrayList<Song>();

    }

    public void printSong() {
        for (Song s : songlist) {
            System.out.println(s.toString());
        }
    }

    public void addSongs() {
        Scanner scan = new Scanner(System.in);
        String quit = "";
        do {
            System.out.println("Enter the name of the song");
            String sname = scan.nextLine();
            System.out.println("Enter the name of the song's artist");
            String sartist = scan.nextLine();
            System.out.println("Enter the song's genre");
            String sgenre = scan.nextLine();
            songlist.add(new Song(sgenre,  sartist, sname));
            System.out.println("Enter yes to enter another song or Enter no to exit");
            quit = scan.nextLine();
        }
        while (quit.equalsIgnoreCase("yes"));
    }

    public void find(){
        Scanner scan = new Scanner(System.in);
        String quit = "";
        String t;
        String a;
        String g;
        do {

            System.out.println("Which are you searching by title, artist, or genre?");
            String f = scan.nextLine();
            int count = 0;
            System.out.println("Enter the title");
            t=scan.nextLine();
            System.out.println("Enter the artists name");
            a = scan.nextLine();
            System.out.println("Enter the genre");
            g = scan.nextLine();
            for (Song s : songlist) {
                if (f.equalsIgnoreCase("title")) {
                    if(s.getTitle().equals(t))
                    {
                        s.toString();
                    }
                    else
                    {
                        count += 1;
                    }

                }
                else if (f.equalsIgnoreCase("artist")) {

                    if(s.getArtist().equals(a))
                    {
                        s.toString();
                    }
                    else
                    {
                        count += 1;
                    }
                }
                else if (f.equalsIgnoreCase("genre")) {
                    if(s.getGenre().equals(g))
                    {
                        s.toString();
                    }
                    else
                    {
                        count += 1;
                    }
                }
                if (count == songlist.size()) {
                    System.out.println("Nothing was found");
                }
            }
            System.out.println("Enter yes to search again or Enter no to exit");
            quit = scan.nextLine();
        }while (quit.equalsIgnoreCase("yes"));
    }
    public static void main(String[] args)
    {
        Ipod song = new Ipod();
        song.addSongs();
        song.printSong();
        song.find();

    }
}
