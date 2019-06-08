public class Circle {
    double radius;
    String color;

    Circle() {
        this.radius = 1.0;
        this.color = "white";
    }

    Circle(double radius) {
        this.radius = radius;
        this.color = "white";
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A cirle with color: " + getColor()
                + "\n and its radius is: " + getRadius()
                + "\n its area is: " + getArea()
                + "\n";
    }
}
