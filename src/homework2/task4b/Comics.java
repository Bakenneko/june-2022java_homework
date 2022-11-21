package homework2.task4b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comics extends Book {

    private String style;
    private String painter;
    private String description;
    private String cover;
    private String speech_balloon;
    private Printing printing;

    public Comics(String color, Material material, String size, String sheets, String country, String author, String title, String language, String publisher, String paperback, int reading_age, String genre, String style, String painter, String description, String cover, String speech_balloon, Printing printing) {
        super(color, material, size, sheets, country, author, title, language, publisher, paperback, reading_age, genre);
        this.style = style;
        this.painter = painter;
        this.description = description;
        this.cover = cover;
        this.speech_balloon = speech_balloon;
        this.printing = printing;
    }
}
