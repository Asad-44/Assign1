public class Artwork {
    // Fields
    private String title;
    private int year;
    private Artist artist;

    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }


    public Artist getArtist() {
        return artist;
    }


    public void displayInformation() {
        System.out.println("Artwork Title: " + title);
        System.out.println("Year Created: " + year);
        System.out.println("Artist: " + artist.getName());
    }


    public static void main(String[] args) {
        Artist artist = new Artist("Asad");
        Artwork artwork = new Artwork("Sherlock Village", 1889, artist);
        artwork.displayInformation();

    }
}
