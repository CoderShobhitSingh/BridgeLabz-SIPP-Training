package Day_4_Inheritense;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("Animals makes a sound");
    }

    static class Dog extends Animal{
        Dog(String name, int age) {
            super(name, age);
        }

        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        Cat(String name, int age) {
            super(name, age);
        }

        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    static class Bird extends Animal {
        Bird(String name, int age) {
            super(name, age);
        }

        @Override
        void makeSound() {
            System.out.println("Bird chirps");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        dog.makeSound(); 
        cat.makeSound(); 
        bird.makeSound(); 
    }


}
