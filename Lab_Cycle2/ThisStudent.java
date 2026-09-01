class ThisStudent {
    String name;
    int age;

    ThisStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        ThisStudent s = new ThisStudent("Anu", 20);
        s.display();
    }
}