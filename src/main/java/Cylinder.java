public class Cylinder extends Circle {
    double height;

    Cylinder() {
        this.height = 1.0;
    }

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return radius * radius * height * Math.PI;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A cylinder with height = " + getHeight()
                + "\n its volume = " + getVolume()
                + "\n which is a subclass of " + super.toString()
                + "\n";
    }

}
