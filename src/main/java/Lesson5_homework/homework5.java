package Lesson5_homework;

public class homework5 {

    public static void main(String[] args) {
        Empoyee testEMp = new Empoyee();
        //tempEmp.showInfoEmployee();
        Empoyee testEMp1 = new Empoyee();
        Empoyee testEMp2 = new Empoyee();
        Empoyee testEMp3 = new Empoyee();
        Empoyee testEMp4 = new Empoyee();//в рамках учебного процесса дал неосмысленные имена объектам
        //однако я понимаю важность осмысленности имен, в реальном проекте так бы не сделал
        testEMp1.setAge(33);
        testEMp2.setAge(22);
        testEMp3.setAge(66);
        testEMp4.setAge(88);
        Empoyee[] manyEmpoyee = {testEMp, testEMp1, testEMp2,
                                          testEMp3, testEMp4};

        System.out.println("This information about employee which age is more 40:");
        System.out.println("==============================");
        int counter = 0;
        for (int i = 0; i < manyEmpoyee.length; i++) {
            if (manyEmpoyee[i].getAge() > 40) {
                if (counter != 0)
                    System.out.println("---------------------------");
                manyEmpoyee[i].showInfoEmployee();
            }
            counter++;
        }
        System.out.println("==============================");


    }

}


