public class TimeKeeper extends Thread {
    private final long timeLimitMillis;
    private final long startTimeMillis;
    private boolean timeExceeded;

    public TimeKeeper(long timeLimitMillis) {
        this.timeLimitMillis = timeLimitMillis;
        this.startTimeMillis = System.currentTimeMillis();
        this.timeExceeded = false;
        setDaemon(true);
    }

    public boolean isTimeExceeded() {
        return timeExceeded;
    }

    public void setTimeExceeded(boolean timeExceeded) {
        this.timeExceeded = timeExceeded;
    }

    public long getTimeLimitMillis() {
        return timeLimitMillis;
    }

    public long getStartTimeMillis() {
        return startTimeMillis;
    }

    @Override
    public void run() {
        while (!isTimeExceeded()) {
            long elapsedTimeMillis = System.currentTimeMillis() - getStartTimeMillis();
            if (elapsedTimeMillis > getTimeLimitMillis()) {
                System.out.println("Time limit exceeded!");
                setTimeExceeded(true);
            }

            try {
                Thread.sleep(1000); // check every 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("TimeKeeper thread interrupted");
            }
        }
    }
}
