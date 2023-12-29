public class MultiThreading extends Thread {
    public void run(){
        for(int i = 5; i >= 1; i--){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MAINNN");
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        MultiThreading m1 = new MultiThreading();
        MultiThreading m2 = new MultiThreading();
        MultiThreading m3 = new MultiThreading();
        System.out.println("Name of m1: "+m1.getName());
        System.out.println("Name of m2: "+m2.getName());
        System.out.println("Name of m3: "+m3.getName());
        m1.setName("CSE");
        System.out.println("Name of m1: "+m1.getName());
        m3.start();
        try {
            m3.join(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        m2.start();
        m1.start();
        m1.setName("CSE");
        System.out.println("Name of m1: "+m1.getName());
        System.out.println("ID of thread 2: "+m2.getId());
        //System.out.println(Thread.activeCount());
    }
}
