package codegym.oop.animal;

public class Cat extends Animal implements Runnable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " Running");
    }
}
