import java.util.*;
class EmployeeInfo {
    private String name, role;
    public EmployeeInfo(String name, String role){
        this.name = name;
        this.role = role;
    }   
    String getname(){
        return name;
    } 
    String getrole(){
        return role;
    }
    double calculateSalary(){
        return 0.0;
    }
}
class HR extends EmployeeInfo{
    private double slr, bns;
    HR(String name, double slr, double bns){
        super(name, "HR Manager");
        this.slr = slr;
        this.bns = bns;
    }
    double calculateSalary(){
        return slr+bns;
    }
}
class Dev extends EmployeeInfo{
    private double slr, bns;
    Dev(String name, double slr, double bns){
        super(name, "Developer");
        this.slr = slr;
        this.bns = bns;
    }
    double calculateSalary(){
        return slr+bns;
    }
}
abstract class Shape{
    abstract double getArea();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return 3.1416*radius*radius;
    }
}
public class Office {
    public static void main(String[] args) {
        EmployeeInfo e1 = new HR("Maria", 20000, 100);
        EmployeeInfo e2 = new Dev("Ravi", 15000, 200);

        System.out.println("The total salary of "+e1.getrole()+" "+e1.getname()+" is "+e1.calculateSalary());
        System.out.println("The total salary of "+e2.getrole()+" "+e2.getname()+" is "+e2.calculateSalary());

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextDouble());
        System.out.println(c.getArea());
    }
}
