package Day2;
class Animal
{
   void Speak()
   {
       System.out.println("Each animal will give each sound");
   }
}
class Dog extends Animal
{
    void Speak()
    {
        System.out.println("Dog will Bark");
    }
}
class Cat extends Dog
{
    void Speak()
    {
        System.out.println("Cat will Meow");
    }
}
public class Inheritance {
    public static void main(String[] args) {
       Animal sound1 = new Animal();
       Dog sound2 = new Dog();
       Cat sound3 = new Cat();
       sound1.Speak();
       sound2.Speak();
       sound3.Speak();

    }
}
