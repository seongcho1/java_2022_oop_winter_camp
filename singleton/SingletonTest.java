class MyThread extends Thread {
    public Singleton threadInstance;
    @Override
    public void run() {
        threadInstance = Singleton.getInstance();
        print();
    }
    
    public Singleton getInstance() {
        return threadInstance;
    }
    
    public void print() {
        System.out.println(threadInstance);
    }
    
}


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();
        //System.out.println(instanceA);
        //System.out.println(instanceB);
   
        System.out.println(instanceA == instanceB);

/*        
        Thread c = new MyThread();
        Thread d = new MyThread();
        Thread e = new MyThread();
        Thread f = new MyThread();
        Thread g = new MyThread();

        c.start(); 
        d.start();
        e.start(); 
        f.start();
        g.start();
*/
        
    }
}