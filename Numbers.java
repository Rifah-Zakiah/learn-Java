import java.util.Random;

public class Numbers {
    public static void main(String[] args){
        double x = 8.88, y = 5.15;
        //Math class functions:
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(-10));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.pow(4, 3));
        System.out.println(Math.round(y));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(y));

        //generate random numbers, good for game developments:
        Random r = new Random();//this do not generates truly random numnber but pseudorandom number which are pretty close.

        int a = r.nextInt();//this will generate any number between the range of int (-2 billion to 2 billion)
        System.out.println(a);

        //in order to limit therandom numbers:
        int b = r.nextInt(6);//generate any number from 0 - 5
        System.out.println(b); 
    }
}
