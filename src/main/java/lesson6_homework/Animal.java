package lesson6_homework;

public abstract class Animal {

    protected String name;
    protected static int count;

    Animal (String _name) {
        name = _name;
        count++;
    }

    public void run(int dist) {
        System.out.println(name + " run distance " + dist + "m.");
    }

    public void swim(int dist) {
        System.out.println(name + " swim distance " + dist + "m.");
    }

    public void showCounter() {
        System.out.println("Count of ainimals is - " + count);
    }

}
