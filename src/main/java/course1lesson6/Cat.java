package course1lesson6;

public class Cat extends Animall{
    public Cat(String name) {
        this.name = name;
        System.out.println("Это кот " + name);
    }
    @Override
    public void run(int lengthObstacle) {
        System.out.println(name + " пробежал " + lengthObstacle + " метров");
    }
    @Override
    public void sail(int lengthObstacle) {
        System.out.println(name + " проплыл " + lengthObstacle + " метров");
    }

}
