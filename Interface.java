/**
 * Animal
 */
import java.util.*;
import java.util.Arrays;
interface Animal {
    void walk();
    public void eat();
}
interface Herbivour{

}
class Horse implements Animal, Herbivour{
    static String color;
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
    public void eat(){
        System.out.println("eats hay and grass");
    }
    
}
// class Student{
//     int rno;
//     String name;
//     static String school;
// }
public class Interface {
    public static void main(String[] args) {
        Horse h = new Horse();
        
        Horse.color = "Black";
        //Student.school = "MPSC";
        // Student[] s = new Student[3];
        // Student rifah;
        // System.out.println(Arrays.toString(s));
        int[] a= new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
    }
}
