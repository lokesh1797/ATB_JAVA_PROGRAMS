package ex_10082024.polymorphism;

public class Lab50 {
    public static void main(String[] args) {
        hound h1=new hound();
        h1.bark();

        Dog d1=new Dog();
        d1.bark();

        Dog dog_ref=new hound();
        dog_ref.bark();
        
    }
}
