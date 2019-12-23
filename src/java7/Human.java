package java7;

import java.util.Objects;

public class Human {
    String name;
    int age;
    int heiht;

    public Human(String name, int age, int heiht) {
        this.name = name;
        this.age = age;
        this.heiht = heiht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age &&
                heiht == human.heiht &&
                name.equals(human.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heiht=" + heiht +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, heiht);

    }
}