class Animal {
public void eat() {
        System.out.println("Animal is eating.");}
public void makeSound() {
        System.out.println("Animal makes a generic sound.");}}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");}
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    public void makeSound(int numBarks) {
        for (int i = 0; i < numBarks; i++) {
            System.out.println("Woof!");}}}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");}
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");}}
public class jaat {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal1.eat();
        animal1.makeSound();
        System.out.println();
        dog.eat();}}

