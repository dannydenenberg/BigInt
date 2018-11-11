import java.util.ArrayList;
import java.util.List;

/**
 * Times anything
 */
public class Timer {
   private double miliseconds;
   private Thread thread;
   private boolean timing;
   private List<Double> savedTimes;

   public Timer() {
       miliseconds = 0;
       thread = new Thread();
       timing = false;
       savedTimes = new ArrayList<>();
   }

   // use threads to run the function asynchronously with the code
   public void start() {
       // reset the time
       this.miliseconds = 0;
       this.timing = true;
       new Thread(new Runnable() {
           @Override
           public void run() {
               time();
           }
       }).start();
   }

    public void time() {
       //System.out.println("In time: " + this.getSeconds());
       try {
           thread.sleep(1);
       } catch (Exception e) { System.out.println("ERROR"); }
       miliseconds++;
       if (!timing) return;
       time();
   }

   public void stop() { timing = false; }

   public void saveTimeInMiliseconds() { this.savedTimes.add(this.getMilliseconds()); }
   public List<Double> getTimes() { return this.savedTimes; }

   public double getMilliseconds() { return this.miliseconds; }
   public double getSeconds() { return this.miliseconds / 1000; }
   public double getHundrethsOfSeconds() { return this.miliseconds / 100; }


}



