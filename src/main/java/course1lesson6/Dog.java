package course1lesson6;


public class Dog extends Animall{
     public Dog(String name) {
         this.name = name;
         System.out.println("Это пёс бублик");
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
