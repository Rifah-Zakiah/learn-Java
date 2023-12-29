public class Demo extends Thread{
    public Demo(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 5 ; i++){
            System.out.println("Running thread is :"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Demo d1 = new Demo("D1");
        Demo d2 = new Demo("D2");
        System.out.println("Thread priority of D1: "+d1.getPriority());
        System.out.println("Thread priority of D2: "+d2.getPriority());

        d1.setPriority(MAX_PRIORITY);
        d2.setPriority(MIN_PRIORITY);

        System.out.println("Now Thread priority of D1: "+d1.getPriority());
        System.out.println("Now Thread priority of D2: "+d2.getPriority());

        d1.start();
        d2.start();
        System.out.println("Name of current thread: "+Thread.currentThread().getName());
        System.out.println("Priority of main thread is: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(NORM_PRIORITY);
        System.out.println("Priority of main thread is: "+Thread.currentThread().getPriority());
    }
}
