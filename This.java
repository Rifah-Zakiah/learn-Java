class student{
    String name;
    int age;

    void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    student(){
        //this is a default ctor.
    }
    student(String name, int age){//this is a parameterized ctor
        this.name = name;
        this.age = age;
    }
    student(student s1){//this is a copy ctor
        this.name = s1.name;
        this.age = s1.age;
    }
}
public class This {
    public static void main(String[] args) {
        student s1 = new student();

        s1.name = "Rifah";
        s1.age = 20;

        s1.printInfo();

        student s2 = new student("Tina",7);

        s2.printInfo();

        student s3 = new student(s1);

        s3.printInfo();
    }
}
