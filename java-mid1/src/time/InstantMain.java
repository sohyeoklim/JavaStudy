package time;

import java.time.Instant;

public class InstantMain {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        long epochSeconds = now.getEpochSecond();
        System.out.println(epochSeconds);
    }
}
