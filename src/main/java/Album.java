public class Album {
    private long id;
    private String artist_name;
    private String record_name;
    private int release_year;
    private double record_sales;
    private String record_genre;

    public Album(){};

    public Album(long id, String artist_name, String record_name, int release_year, double record_sales, String record_genre) {
        this.id = id;
        this.artist_name = artist_name;
        this.record_name = record_name;
        this.release_year = release_year;
        this.record_sales = record_sales;
        this.record_genre = record_genre;
    }

    public Album (long id, String artist_name, String record_name) {
        this.id = id;
        this.artist_name = artist_name;
        this.record_name = record_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getRecord_name() {
        return record_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public double getRecord_sales() {
        return record_sales;
    }

    public void setRecord_sales(double record_sales) {
        this.record_sales = record_sales;
    }

    public String getRecord_genre() {
        return record_genre;
    }

    public void setRecord_genre(String record_genre) {
        this.record_genre = record_genre;
    }
}
