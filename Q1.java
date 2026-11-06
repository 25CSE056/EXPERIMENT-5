interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}

public class Q1_AnimalInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
