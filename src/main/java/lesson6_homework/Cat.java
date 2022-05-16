package lesson6_homework;

public class Cat extends Animal{

    public Cat (String _name) {
        super(_name);
    }

    @Override
    public void run(int dist) {
        if (dist >= 1 && dist <= 200) {
            System.out.println(name + " run distance " + dist + "m.");
        }else {
            System.out.println(name + " can not run this distance");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat can not swim!!!");
    }
}
