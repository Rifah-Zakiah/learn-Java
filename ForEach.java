import java.util.*;
public class ForEach {
    public static void main(String[] args){
        //used to iterate through a array/collections
        String[] animals = {"cat", "dog", "rat", "bat"};
        for (String i : animals) {
            System.out.println(i);
        }
        //implementation on ArrayList:
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("chips");
        food.add("nuggets");
        food.add("hotdog");
        for (String i : food) {
            System.out.println(i);
        }
    }
}
