public class TestPolymorphism{
    public static void main(String[] args){
        Animal a = new Cat();
        show(a);
        Animal b = new Dog();
        show(b);
    }

    public static void show(Animal a){
        a.eat();
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.work();
        }
        else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.work();
        }
    }
}

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eats fish");
    }
    public void work(){
        System.out.println("Cat stays at home");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eats bone");
    }
    public void work(){
        System.out.println("Dog runs");
    }
}

// 多态化：继承+重写+父类引用指向子类对象
