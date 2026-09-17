class Circle {
    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    static Circle calculateArea(double radius) {
        return new Circle(radius);
    }

    void display() {
        System.out.printf("Radius = %.1f%n", radius);
        System.out.printf("Area = %.2f%n", area);
    }

    public static void main(String[] args) {

        Circle c = calculateArea(7);

        c.display();
    }
}