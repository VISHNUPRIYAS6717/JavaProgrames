import java.util.Scanner;

class FinalKeyword {

    final double PI = 3.14159;

    double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        FinalKeyword obj = new FinalKeyword();

        double area = obj.calculateArea(radius);

        System.out.printf("Area = %.2f%n", area);

        sc.close();
    }
}