package module2._7_abstract_interface.practice.p1;

public class Chicken extends Animal implements Edibler {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }

}
