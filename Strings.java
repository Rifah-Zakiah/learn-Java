//string methods:
public class Strings {
    public static void main(String args[]){
        String name = "Rifah";
        System.out.println(name.equals("rifah"));//returns boolean value: true/false
        System.out.println(name.equalsIgnoreCase("rifah"));//ignores the upper and lower case just matches the characters
        System.out.println(name.length());//returns integer value 
        System.out.println(name.charAt(3));//returns the character of the index provided as argument
        //System.out.println(name.charAt(7));--> this provides an exception (error) & after an exception warning no other code runs
        System.out.println(name.indexOf('h'));//returns the index of passed character
        System.out.println(name.isEmpty());//returns boolean value
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());//trims all the space
        System.out.println(name.replace('R', 'r'));
    }
}
