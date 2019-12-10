public class Human {

    private String name;
    private int age;
    private int height;
    private int weight;

    public String getName(){
        return name;
    }
    public int getAge(int age){
        return age;
    }

    public int getHeight(int weight){
        return weight;
    }

    public int getHeight() {
        return height;
    }
    public Human(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}

