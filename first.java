//Basic i/o, very very different from C/C++
import java.util.*;
public class first {
    public static void main(String args[]){
        //output:
        System.out.println("Hello World");//ln adds new line
        System.out.print("Hello World");
        //variables:
        int a = 22;
        //input:
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println();
        System.out.println(a);
        System.out.println(name);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x+y);

        sc.close();

    }
}
