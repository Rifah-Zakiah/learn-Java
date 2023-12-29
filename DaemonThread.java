public class DaemonThread extends Thread{
    public void run(){
        try {
            if (Thread.currentThread().isDaemon()) {
                System.out.println("Daemon Thread work!!");
            }else{
                System.out.println("User Thread work.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        DaemonThread d2 = new DaemonThread();
        DaemonThread d3 = new DaemonThread();
        d1.setDaemon(true);
        System.out.println(d2.isDaemon());
        d1.start();
        d2.start();
        d3.start();
        System.out.println(d1.isDaemon());     
    }
}
