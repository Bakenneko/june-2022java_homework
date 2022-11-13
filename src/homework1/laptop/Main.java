package homework1.laptop;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
            laptop.setBrand_series(" MSI");
            laptop.setScreen_size(17.3);
            laptop.setColor(" Core Black");
            laptop.setHard_disk_size(512);
            laptop.setCpu_model(" Core i7-10750H");
            laptop.setRam_memory(16);
        System.out.println(laptop);
    }
}
