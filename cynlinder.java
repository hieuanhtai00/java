class cynlinder extends circle {
    double height;

    cynlinder() {
    }

    cynlinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return 3.14 * radius * radius * height;
    }
}
