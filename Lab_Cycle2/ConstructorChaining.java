class ConstructorChaining {
    String name;
    int age;

    // Default constructor
    ConstructorChaining() {
        this("Manu", 21);
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    ConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        ConstructorChaining s = new ConstructorChaining();
        s.display();
    }
}