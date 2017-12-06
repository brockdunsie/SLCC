public class Song {
    private String genre;
    private String artist;
    private String title;
    public Song()
    {
        genre = "null";
        artist = "null";
        title = "null";
    }
    public Song(String g, String a, String t)
    {
        genre = g;
        artist = a;
        title = t;
    }
    public void setGenre(String g)
    {
        genre = g;
    }
    public void setArtist(String a)
    {
        artist = a;
    }
    public void setTitle(String t)
    {
        title = t;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title + "\n Genre: " + genre + "\n Artist: " + artist;
    }
    public static void main (String[]args)
    {
        Song song1 = new Song("Rap", "Amine", "Caroline" );
        System.out.println(song1);
        Song song2 = new Song("Alternative", "Artic Monkeys", "Why'd you only call me when you're high?");
        System.out.println(song2);
        System.out.println(song2.getGenre());
        System.out.println(song1.getArtist());

    }
}
