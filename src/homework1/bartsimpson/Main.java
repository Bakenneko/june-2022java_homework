package homework1.bartsimpson;

public class Main {
    public static void main(String[] args) {

        Bart bart = new Bart();
        bart.setAge(10);
        bart.setGender("mail");
        bart.setAlive(true);
        bart.setHair_color("Blond");
        bart.setCharacter(new String[]{
                "непослух",
                "бешкетництво",
                "бунтарство",
                "неповага до авторитетів",
                "дотепність" });
        System.out.println(bart);
    }
}
