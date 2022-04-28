package lesson6_homework;

public class MainClass {

    public static void main(String[] args) {

        Dog dg = new Dog("Bobik");
        Cat ct = new Cat("Murzic");

        dg.run(50);
        ct.run(15);
        ct.swim(12);
        //ct.showCounter();
        Cat ct1 = new Cat("Furzic");
        //ct1.showCounter();
        Dog dg1 = new Dog("Tuzic");
        dg1.showCounter();

    }
}
