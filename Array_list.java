import java.util.*;

public class Array_list {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();/*ArrayList er type always has to be a reference type / wrapper class
        therefore int = Integer
                  double = Double
                  char = Character
                  boolean = Boolean 
                  String is already a reference type. Thats why it starts with capital 'S'*/
        food.add("pizza");
        food.add("burger");
        food.add("chips");
        food.add("nuggets");
        food.add("hotdog");
        
        //dispaly:
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        food.set(0, "burrito");//set element at index 0 as burrito
        System.out.println(food.size());
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        food.remove(3);//remove element at index 3 which is in this case chips
        System.out.println(food.size());
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        food.clear();//clear the whole array list
        System.out.println(food.size());//returns 0

        //2D ArrayList = list of lists:
        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("cake");
        bakery.add("bread");
        bakery.add("donuts");
        System.out.println(bakery);//print the whole list
        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("okra");
        veggies.add("tomato");
        veggies.add("potato");
        System.out.println(veggies);
        ArrayList<String> drink = new ArrayList<String>();
        drink.add("soda");
        drink.add("coffee");
        drink.add("tea");
        System.out.println(drink);
        ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
        grocery.add(veggies);
        grocery.add(bakery);
        grocery.add(drink);
        System.out.println(grocery);//print the whole list of lists

        System.out.println(grocery.get(0));//retrieve the first list of the list of lists
        System.out.println(grocery.get(0).get(0));//get each element by navigating its address
        System.out.println(grocery.get(2).get(1));
    }
}
