package abstractClassAndInterface;

public class StudentJava {

    public static void main(String[] args) {

        Student student = new Student(1,"osman");
        student.writeInfo();

        Student studentTwo = new Student(2,"okan");
        studentTwo.writeInfo();

        Student studentThree = new Student(3,"hasan");
        studentThree.writeInfo();


    }

}

class Student {

    private int id;
    private String name;
    private static int totalStudent;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
        totalStudent ++;
    }


    void writeInfo() {

        System.out.println("No : " + id + " Name " + name + " Toplam :" + totalStudent);

    }

}
