//For some 'exception' related warning, duita array aeksathe output dichhe na:
import java.util.*;
public class Array_code  {
    public static void main(String[] args){
        
        //declaration + assingmrent:
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        System.out.println(Arrays.toString(num));
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println("The third element is "+num[3]);
        String[] cars = {"Toyota", "Tesla", "Maruti", "Audi", "Mercedes"};//Initialization
        //display
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
