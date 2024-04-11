package creational.singleton;

import java.time.LocalDateTime;

public final class CallCenter {
    private static CallCenter instance = null;
    private LocalDateTime creationDate = null;
    private int callCount;

    private CallCenter() {
        creationDate = LocalDateTime.now();
        callCount = 0;
    }
    public static CallCenter provide() {
        if (instance == null) instance = new CallCenter();
        return instance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String call() {
        callCount++;
        return String.format("Hello! You are in %s position in queue. Please wait...", callCount);
    }
}
