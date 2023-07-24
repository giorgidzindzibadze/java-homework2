public class Circle {
    private double radius;
    public static int numberOfCircleInstances = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.setRadius(15);
        System.out.println(c1.getRadius());

        String circleString = Util.circleToString(c1);
        System.out.println(circleString);
    }

}