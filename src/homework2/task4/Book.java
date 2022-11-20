package homework2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends Papyrus {

        private String author;
        private String title;
        private int year;
        private String content;
        private String country;
        private double cost;

        public Book(Write write, Read read, Page page, Material material, Pages pages, String author, String title, int year, String content, String country, double cost) {
                super(write, read, page, material, pages);
                this.author = author;
                this.title = title;
                this.year = year;
                this.content = content;
                this.country = country;
                this.cost = cost;
        }
}
