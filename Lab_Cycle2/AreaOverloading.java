class AreaOverloading {

    // Area of square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    // Area of rectangle
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    public static void main(String[] args) {

        AreaOverloading obj = new AreaOverloading();

        obj.area(6);
        obj.area(8, 4);
    }
}