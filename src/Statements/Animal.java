package Statements;

public class Animal {

        String colour;
        String breed;
        public void eat() {

            System.out.println("eating");
        }

    }
    class Dog extends Animal{
        int age;
        public void bark() {
            System.out.println("barking");
        }

        public void walk() {
            System.out.println("walking");
        }

    }
    class cat extends Animal{
        public void meow(){
            System.out.println("meowing");

        }
        public static void main(String[]args){
            Animal a = new Animal();
            a.eat();

           Dog a1 = new Dog();
           a1.bark();
           a1.walk();

           cat c = new cat();
           c.meow();

        }
    }