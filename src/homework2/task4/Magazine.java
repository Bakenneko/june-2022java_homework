package homework2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine extends Book{

    private String personality;
    private String structure;

    public Magazine(String author, String title, int year, String content, String country, double cost, String personality, String structure) {
        super(author, title, year, content, country, cost);
        this.personality = personality;
        this.structure = structure;
    }
}
