public class Main {
    public static void main(String[] args) {

        BigInt b = new BigInt(50000);

        Timer t = new Timer();


        double average = 0;

        for (int i = 0; i < 200; i++) {
            t.start();
            new BigInt(1000).factorialSelf();
            t.stop();
            t.saveTimeInMiliseconds();
        }

        average = t.getTimes().stream().mapToDouble(time -> time.doubleValue()).sum() / t.getTimes().size();

        System.out.println(average);



    }
}
