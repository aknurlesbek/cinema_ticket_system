public class Movie {
    private int id;
    private String title;
    private String genre;

    public Movie(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    // getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }

    public void showInfo() {
        System.out.println("Movie ID: " + id + ", Title: " + title + ", Genre: " + genre);
    }

    public boolean equals(Movie other) {
        return other != null && this.id == other.id;
    }
}