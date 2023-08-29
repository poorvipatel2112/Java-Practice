sealed class Animal permits Dog , Cat{
    void walk(){
        System.out.println("Animal can walk");
    }

}

final class Dog extends Animal{
    void walk(){
        System.out.println("dog can walk");
    }
}
final class Cat extends Animal{
    void walk(){
        System.out.println("cat can also walk");
    }
}

public class staticFinal {
        public static  void main(String[] args){

        Dog dog = new Dog();
        dog.walk();
        Animal animal = new Animal();
        animal.walk();
        }
}
