package course1lesson6;

public class Animall {
    protected String name;
    protected int lengthObstacle;
    public Animall() {
    }

    public Animall(String name) {
    }
    public void run(int lengthObstacle) {
        System.out.println(name + " пробежал " + lengthObstacle + " метров");
    }
    public void sail(int lengthObstacle) {
        System.out.println(name + " проплыл " + lengthObstacle + " метров");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthObstacle() {
        return lengthObstacle;
    }

    public void setLengthObstacle(int lengthObstacle) {
        this.lengthObstacle = lengthObstacle;
    }
}
