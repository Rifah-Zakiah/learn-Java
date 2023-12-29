abstract class Hollywood{
    abstract String name();
    abstract String genre();
    abstract String length();
    abstract String relese_date();
    abstract String cast();
    abstract double imdb();
}
class Nun2 extends Hollywood{
    String name(){
        return "Nun2";
    }
    String genre(){
        return "Horror";
    }
    String length(){
        return "1 hours 30 mints";
    }
    String relese_date(){
        return "2023";
    }
    String cast(){
        return "someone idk";
    }
    double imdb(){
        return 4.6;
    }
}
class Wish extends Hollywood{
    String name(){
        return "Wish";
    }
    String genre(){
        return "Animated/Fantasy";
    }
    String length(){
        return "1 hours 10 mints";
    }
    String relese_date(){
        return "2023";
    }
    String cast(){
        return "Chris Pine";
    }
    double imdb(){
        return 6.6;
    }
}
class Creator extends Hollywood{
    String name(){
        return "Creator";
    }
    String genre(){
        return "Action/Thriller";
    }
    String length(){
        return "2 hours";
    }
    String relese_date(){
        return "2023";
    }
    String cast(){
        return "John David Washington";
    }
    double imdb(){
        return 7.6;
    }
}
public class Movies{
    public static void main(String[] args) {
        Hollywood m1 = new Nun2();
        System.out.println(m1.name()+" "+m1.genre()+" "+m1.length()+" "+m1.relese_date()+" "+m1.cast()+" "+m1.imdb());

        m1 = new Wish();
        System.out.println(m1.name()+" "+m1.genre()+" "+m1.length()+" "+m1.relese_date()+" "+m1.cast()+" "+m1.imdb());

        m1 = new Creator();
        System.out.println(m1.name()+" "+m1.genre()+" "+m1.length()+" "+m1.relese_date()+" "+m1.cast()+" "+m1.imdb());
    }
}