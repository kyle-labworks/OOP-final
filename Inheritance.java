public class InheritanceExample {

    static class Animal {
        String name;

        void eat() {
            System.out.println(name + " is eating.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println(name + " barks.");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";   
        d.eat();            
        d.bark();   
    }
}
