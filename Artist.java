public class Artist {
    // Field
    public String name;


    public Artist(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void displayInformation() {
        System.out.println("Artist's Name: " + name);
    }
    public static void main(String[] args) {
        Artist artist = new Artist("Asad");
        artist.displayInformation();
    }
}
