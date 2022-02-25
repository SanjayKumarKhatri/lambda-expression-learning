package work;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable runnable = ()->{

            for (int i=0; i<10; i++){
                System.out.println("Value Of I is : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread thread =  new Thread(runnable);
        thread.setName("Sanjay Kumar");
        thread.start();

        Runnable t = () -> {

            for (int i=0;i<=10;i++){
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Thread thread1 = new Thread(t);
        t.run();
    }
}
