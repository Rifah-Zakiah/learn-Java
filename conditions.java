//sane as C/C++
import java.util.Scanner;

public class conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a%2 == 0) {
            System.out.println("The input number is EVEN.");
        }else{
            System.out.println("The input number is ODD.");
        }
    //Before switch, through else if:
        System.out.println("Enter option 1-5: ");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello!");
        }else if (button == 2) {
            System.out.println("Assalamualaikum!");
        }else if (button == 3) {
            System.out.println("Bonjour!");
        }else if (button == 4) {
            System.out.println("Hola!");
        }else if (button == 5) {
            System.out.println("Namaste!");
        }else
            System.out.println("Invalid input!!");
    //Through switch:
        System.out.println("Enter option 1-5: ");
        int knob = sc.nextInt();
        switch (knob) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Assalamualaikum!");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
            case 4:
                System.out.println("Hola!");
                break;
            case 5:
                System.out.println("Namaste!");
                break;
            default:
            System.out.println("Invalid input!!");
                break;
        }
        sc.close();
    }
   
    
}
