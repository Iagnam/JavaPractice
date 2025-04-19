public class pb7 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.sound();
        c.sound();
    }

}
abstract class Animals{
    public abstract void sound();
}
class Dog extends Animals{
    @Override
   public void sound(){
        System.out.println("Woof !! owowow ");
    }
}
class Cat extends Animals{
   @Override
    public void sound(){
        System.out.println("meow meow");
    }
}