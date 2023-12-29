public class MultiThreading2 implements Runnable{
    public void run()  {
        System.out.println("Running...");
        for(int i = 3; i >= 1; i--){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }  //System.out.println(i);
    }
    public static void main(String[] args) throws InterruptedException{
        MultiThreading2 m1 = new MultiThreading2();
        MultiThreading2 m2 = new MultiThreading2();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        // for(int i = 3; i >= 1; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }
        // System.out.println(Thread.activeCount());
        t2.start();
    }
}
