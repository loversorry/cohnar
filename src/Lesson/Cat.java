package Lesson;

public class Cat {
    private String name;
    private int weight;
    private int height;
    private int age;
    private boolean gender;

    public Cat(String name, int weight, int height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public void voice() {
        System.out.println("мяу-мяу");
    }

    // геттер
    public String getName() {
        return name;
    }

    public void setName(String name){

    }
}
