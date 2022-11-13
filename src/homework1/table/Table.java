package homework1.table;

public class Table {

    private int id; private String name;
    private int price; private String country;
    private int diameter; private int height;
    private String type; private String brand;

    public Table () {
    }

    public Table(int id, String name, int price, String country, int diameter, int height, String type, String brand) {
        this.id = id; this.name = name;
        this.price = price;
        this.country = country;
        this.diameter = diameter;
        this.height = height;
        this.type = type;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", country='" + country + '\'' +
                ", diameter=" + diameter +
                ", height=" + height +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


}
