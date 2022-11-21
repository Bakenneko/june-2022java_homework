package homework2.task4b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor


public class Book extends Papyrus {

    private String author;
    private String title;
    private String language;
    private String publisher;
    private String paperback;
    private int reading_age;
    private String genre;

    public Book(String color, Material material, String size, String sheets, String country, String author, String title, String language, String publisher, String paperback, int reading_age, String genre) {
        super(color, material, size, sheets, country);
        this.author = author;
        this.title = title;
        this.language = language;
        this.publisher = publisher;
        this.paperback = paperback;
        this.reading_age = reading_age;
        this.genre = genre;
    }
}
