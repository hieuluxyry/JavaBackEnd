public class StopWatch {
    private long startTime ;
    private long endTime ;
    public StopWatch (){
        startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

}
