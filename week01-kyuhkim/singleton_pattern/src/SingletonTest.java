import Singleton.*;

//public class SingletonTest {
//    public static void main(String[] args) {
//        Singleton instanceA = Singleton.getInstance();
//        Singleton instanceB = Singleton.getInstance();
//        System.out.println(instanceA == instanceB);
//    }
//}

public class SingletonTest {
    // Thread 상속받아 1개 생성
    private class FirstThread extends Thread {
        public Singleton instance;

        @Override
        public void run() {
            instance = Singleton.getInstance();
        }
    }

    // Runnable 구현하여 1개 생성
    private class SecondThread implements Runnable {
        public Singleton instance;

        @Override
        public void run() {
            instance = Singleton.getInstance();
        }
    }

    // 내부 클래스 - Thread 상속받기
    private class ThirdThread extends Thread {
        public Singleton instance;

        @Override
        public void run() {
            instance = Singleton.getInstance();
        }
    }

    public static void main(String[] args) {
        SingletonTest t = new SingletonTest();

        //스레드1
        FirstThread th1 = t.new FirstThread();
        th1.start();

        //스레드2
        SecondThread th2 = t.new SecondThread();
        Thread sec_thread = new Thread(th2);
        sec_thread.start();

        //스레드3
        ThirdThread th3 = t.new ThirdThread();
        th3.start();

        // join하는 방법으로 대처할 수 있음
        while (th1.instance == null || th2.instance == null || th3.instance == null) {}
        System.out.println(th1.instance);
        System.out.println(th2.instance);
        System.out.println(th3.instance);
        System.out.println(th1.instance == th2.instance);
        System.out.println(th2.instance == th3.instance);
        System.out.println(th3.instance == th1.instance);
    }
}
