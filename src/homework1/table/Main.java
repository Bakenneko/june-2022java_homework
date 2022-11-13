package homework1.table;

public class Main {
    public static void main(String[] args) {

        Table table = new Table();
        table.setId(1);
        table.setName("Стіл обідній");
        table.setPrice(2500);
        table.setCountry("Україна");
        table.setDiameter(800);
        table.setHeight(700);
        table.setType("обідній");
        table.setBrand("New style");
        System.out.println(table);

    }

}
