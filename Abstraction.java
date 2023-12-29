abstract class Animal{
    abstract void walk();
    void eat(){
        System.out.println("eats...");
    }
    Animal(){
        System.out.println("A new animal is created.");
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("Wallks on 4 legs.");
    }
    Horse(){
        System.out.println("Horse is created.");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on Two legs.");
    }
    Chicken(){
        System.out.println("Chicken is created.");;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();

        h.eat();
        h.walk();

        Chicken ch = new Chicken();

        ch.walk();

        // Animal a = new Animal() {
            
        // };
    }
}
