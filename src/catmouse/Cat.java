package catmouse;

public class Cat {
    private String name;
    private int speed;
    private int weight;
    private int catchedMouse;

    public Cat(String name, int speed, int weight, int catchedMouse) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.catchedMouse = catchedMouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCatchedMouse() {
        return catchedMouse;
    }

    public void setCatchedMouse(int catchedMouse) {
        this.catchedMouse = catchedMouse;
    }

    public void catchMouse(Mouse mouse){
        if(this.speed > mouse.getSpeed() {

    }
}
