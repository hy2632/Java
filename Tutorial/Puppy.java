// public class HelloWorld {
//     public static void main(final String[] args) {
//         System.out.println("Hello World");
//     }
// }

/* 
class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(juice.size);
    }
}
*/

/*
class Dog{
    String breed;
    int age;
    String color;
    void barking(){
        System.out.println("barking");
    }

    void hungry(){
        System.out.println("hungry");
    }

    void sleeping(){
        System.out.println("sleeping");
    }
}

public class test{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.breed = "dog";
        dog.age = 12;
        dog.color = "black";
        dog.barking();
    }
}
*/

public class Puppy{
    public Puppy(String name){
        System.out.println("小狗的名字是： " + name);
    }

    int puppyAge;

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄是： "+puppyAge);
        return puppyAge;
    }


    public static void main(String[] args){
        Puppy puppy = new Puppy("dog1");
        puppy.setAge(16);
        puppy.getAge();
    }
}