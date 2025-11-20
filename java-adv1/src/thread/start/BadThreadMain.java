package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": run() 호출 전");
        helloThread.run(); //main 스레드가 run()을 호출해줌
        System.out.println(Thread.currentThread().getName() + ": run() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
