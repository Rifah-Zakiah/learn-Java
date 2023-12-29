import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class TestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter dividend: ");
            int a = sc.nextInt();
            System.out.println("Enter divisor: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("result: "+c);
        }catch (ArithmeticException e) {//catches specific exceptions
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("PLease enter an integer!!");
        }catch (Exception e) {//universal exception handler; catches all kinds of exceptions
            System.out.println("Something went wrong.");
        }

        int a[] = new int[4];
        try {
            for(int i = 0; i <= 4; i++){
                a[i] = i;
                System.out.print(a[i]+" ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n"+e.getMessage());
        }

        try {
            FileReader fr = new FileReader("abc.txt");
            System.out.println(fr.read());
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File("abc.txt");
            sc = new Scanner(f);
        } catch (Exception e) {
            System.out.println("Could not find file!!");
        }

        try {
            // System.out.println("Enter dividend: ");
            // int a = sc.nextInt();
            // System.out.println("Enter divisor: ");
            // int b = sc.nextInt();
            divide(5, 0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        try {
            String s = null;
            printlen(s);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //Custom user defined exception:
        try {
            System.out.println("Enter an int less than 10: ");
            int k = sc.nextInt();
            if (k > 10) {
                throw new MyException("DA HELL!!");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
        
        //the restrictive catch block will stay above the other catch blocks
        try {
            //mimicing an exception
            throw new Exception("Just for fun!!");
        }catch(ArithmeticException e){
            System.out.println("Arithmatioc exception.");
        }catch (Exception e) {
            System.out.println("Normal exception.");
        }

        finally{//there can be only one finally block
            System.out.println("No matter what happens, this will always execute!!");
            sc.close();
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero.");
        }
        return a/b;
    }
    static void printlen(String str){
        System.out.println(str.length());
    }
}
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}