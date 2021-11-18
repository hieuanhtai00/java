class circle {
    double radius;
    String color;

    circle() {
    }

    circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "radius " + radius + "; color : " + color;
    }
}