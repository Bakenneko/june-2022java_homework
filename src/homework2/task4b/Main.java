package homework2.task4b;

public class Main {
    public static void main(String[] args) {

        Papyrus papyrus = new Papyrus(
                "white",
                Material.PAPYRUS_PAPER,
                "30 x 40 cm",
                "8-inch x 12-inch",
                "Egypt"
        );

        Book book = new Book(
                "brown",
                Material.PAPER,
                "20 x 20",
                "one",
                "United Kingdom",
                "Lewis Carroll",
                "Alice in Wonderland",
                "English",
                " Independently published (May 6, 2021)",
                "101 pages",
                9,
                "fantasy"

        );

        Comics comics = new Comics(
                "black",
                Material.MATTE_PAPER,
                "6.65 x 0.8 x 10.15 inches",
                "three",
                "USA",
                "MARVEL",
                "Moon Knight",
                "English",
                "Marvel (March 8, 2022)",
                "320 pages",
                13,
                "fantasy",
                "painting",
                "Small wood",
                "Marc Spector (a.k.a. Moon Knight/Jake Shockley/Steven Grant) has been fighting criminals and keeping New York City safe for years... or has he? When he wakes up in an insane asylum with no powers and a lifetime's worth of medical records, his whole identity (indentities) are called into question.",
                "light",
                "a lot",
                new Printing(
                        "image"
                )

        );
    }
}
