//import java.util.Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();


        Circle c2 = new Circle(6.8);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c3 = new Circle(8.5);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c4 = new Circle(9.2);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c5 = new Circle(1.8);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c6 = new Circle(6.0);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);


        String circle2 = Util.circleToString(c2);
        String circle3 = Util.circleToString(c3);
        String circle4 = Util.circleToString(c4);
        String circle5 = Util.circleToString(c5);
        String circle6 = Util.circleToString(c6);

        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println(circle5);
        System.out.println(circle6);



//          bonus task

        Circle c7 = new Circle(random.nextDouble() * 13);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c8 = new Circle(random.nextDouble() * 13);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c9 = new Circle(random.nextDouble() * 13);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c10 = new Circle(random.nextDouble() * 13);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);
        Circle c11 = new Circle(random.nextDouble() * 13);
        System.out.println("Number of Circle instances: " + Circle.numberOfCircleInstances);



        String crcl7 = Util.circleToString(c7);
        String crcl8 = Util.circleToString(c8);
        String crcl9 = Util.circleToString(c9);
        String crcl10 = Util.circleToString(c10);
        String crcl11 = Util.circleToString(c11);


        System.out.println(crcl7);
        System.out.println(crcl8);
        System.out.println(crcl9);
        System.out.println(crcl10);
        System.out.println(crcl11);
    }



}
