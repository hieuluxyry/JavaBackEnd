//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       StopWatch stopWatch = new StopWatch();
       try {
           Thread.sleep((long)(Math.random()*5000));
       } catch (InterruptedException s){
           s.printStackTrace();
       }
       stopWatch.stop();
        System.out.println("Elapsed time (milliseconds): " + stopWatch.getElapsedTime() );
    }
}