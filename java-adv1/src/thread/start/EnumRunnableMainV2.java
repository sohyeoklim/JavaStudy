package thread.start;

import static util.MyLogger.log;

public class EnumRunnableMainV2 {

    public static void main(String[] args) {
        log("main() start");

        //익명클래스
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }
}
