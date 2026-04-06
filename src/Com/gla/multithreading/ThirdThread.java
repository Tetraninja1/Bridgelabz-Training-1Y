package Com.gla.multithreading;

public class ThirdThread implements Runnable{
    @Override
    public void run() {
        for (int i = 61; i <= 70; i++) {
            System.out.print(i + " ");
            try{
                Thread.sleep(1000);
            }catch(Exception exp){
                System.out.println("Done");
            }
        }

    }
}
