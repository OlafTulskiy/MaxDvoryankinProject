package Lesson5_homework;

public class Empoyee {
    private String fio; //ФИО
    private String position; //должность
    private String email;
    private String telNumber;
    private int salary; //зарплата
    private int age;

    public Empoyee() {
        this.fio = "Ivanov Ivan Ivanich";
        this.position = "ordinary employee";
        this.email = "example@example.com";
        this.telNumber = "+7 910 111 22 33";
        this.salary = 100000;
        this.age = 50;
    }
    public  Empoyee (String _fio, String _position,
                     String _email, String _telNumber,
                     int _salary, int _age) {
        this.fio = _fio;
        this.position = _position;
        this.email = _email;
        this.telNumber = _telNumber;
        this.salary = _salary;
        this.age = _age;
    }

    public void showInfoEmployee () {
        System.out.println("This is information about - " +
                this.fio);
        System.out.println("Position in company - " + this.position );
        System.out.println("Email  -  " + this.email);
        System.out.println("Telnumber  -  " + this.telNumber);
        System.out.println("Salary of employee - " + this.salary);
        System.out.println("Age  -  " + this.age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
