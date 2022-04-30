public class Circle {

    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //behaviours

    public double getRadius() {
        return this.radius;
    }

    public double getCircumference() {
        return  2 *(Math.PI * radius);
    }
}
