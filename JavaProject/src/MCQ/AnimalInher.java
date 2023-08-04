package MCQ;

public class AnimalInher {
public static void main(String[] args) {
        Animal animal = new Horse();
        //animal.eat("fooder");
        animal.eat();

    }

}
    class Animal{
        void eat() {
            System.out.println("Animal eats");
        }
    }
    class Horse extends Animal{
        void eat(String grass) {
            System.out.println("horse eats" + grass);
        }
    }


    