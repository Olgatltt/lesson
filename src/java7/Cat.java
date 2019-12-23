package java7;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o){
            return true;
        }
        if (!this.getClass().getCanonicalName().equals(o.getClass().getCanonicalName())) {
            return false;
        }
        Cat cat = (Cat)o;
        return age == cat.age &&
                color == cat.color &&
                name.equals(cat.name);
        }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

