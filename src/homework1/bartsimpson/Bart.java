package homework1.bartsimpson;

import java.util.Arrays;

public class Bart {

    private int age;
    private String gender;
    private Boolean alive;
    private String hair_color;
    private String[] character;

    public Bart() {
    }

    public Bart(int age, String gender, Boolean alive, String hair_color, String[] character) {
        this.age = age;
        this.gender = gender;
        this.alive = alive;
        this.hair_color = hair_color;
        this.character = character;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String[] getCharacter() {
        return character;
    }

    public void setCharacter(String[] character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Bart{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", alive=" + alive +
                ", hair_color='" + hair_color + '\'' +
                ", character=" + Arrays.toString(character) +
                '}';
    }
}
