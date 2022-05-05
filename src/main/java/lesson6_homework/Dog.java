package lesson6_homework;

public class Dog extends Animal{

    public Dog (String _name) {
        super(_name);
    }

    @Override
    public void run(int dist) {
        if (dist >= 1 && dist <= 500) {
            System.out.println(name + " run distance " + dist + "m.");
        }else {
            System.out.println(name + " can not run this distance");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist >= 1 && dist <= 10) {
            System.out.println(name + " swim distance " + dist + "m.");
        } else {
            System.out.println(name + " can not swim this distance");
        }
    }
}
