package course1lesson6;

public class AnimalsApp {
    public static void main(String[] args) {

    Cat cat = new Cat("Рыжик");
    cat.run(200);
    cat.sail(0);
        System.out.println();
    Dog dog = new Dog("Бублик");
    dog.run(500);
    dog.sail(10);
        System.out.println();
    Animall[] animalls = {cat, dog};
    int sum = 0;
    for (int i = 0; i < animalls.length; i++) {
        sum = sum + i;
    }
        System.out.println("Общее колличество животных: " + (sum + 1));
    }
}
