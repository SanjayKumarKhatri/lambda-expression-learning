package work;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        System.out.println("My System started.....");

        //MyInter myInter = new MyInterImpl();
        //myInter.sayHello();

       /* MyInter i  = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is first class........");

            }
        };
        i.sayHello();

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is second anonymous class...");
            }
        };
        i2.sayHello();*/

        //Using our interface by the help of lambda

        MyInter i = () -> {
            System.out.println("This is first time i am using lambda expression");
        };
        i.sayHello();

        SumInter sumInter =(a,b)-> a + b;
        System.out.println("Sum Of A And B Is : "+ sumInter.sum(23,76));

        LengthInter ln = str -> str.length();
        System.out.println(ln.getLength("Sanjay Kumar"));
    }
}
