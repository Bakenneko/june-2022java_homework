package homework2.task4;

// Cтворити клас ланцюг наслідування:
// Папірус-Кинга-Журнал
// Папірус-Книга-Комікс
// Кількість полів довільна.

public class Main {
    public static void main(String[] args) {

        Papyrus papyrus = new Papyrus(
            new Write("stylus"),
            new Read("egyptian","hieroglyphs"),
                new Page(Img.NOIMAGE),
                new Material(Types.PAPYRUS),
                new Pages(1)

        );

        Book book = new Book(
                new Write("copy machine"),
                new Read("English","latin script"),
                new Page(Img.IMAGE),
                new Material(Types.PAPER),
                new Pages(352),
                "Hardback",
                "J. K. Rowling",
                2016,
                "Harry Potter",
                "London, United Kingdom",
                17.14

        );

        Magazine magazine = new Magazine(
                "Magazine Cafe",
                "New",
                2021,
                "Women's Fashion Magazines",
                "United Kingdom",
                11.99,
                "Karl Lagerfeld",
                "Fashion"

        );
    }

}
