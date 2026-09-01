class StudentReturn {
    String name;
    int mark;

    StudentReturn(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    static StudentReturn createStudent() {
        StudentReturn s = new StudentReturn("Arun", 87);
        return s;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Mark : " + mark);
    }

    public static void main(String[] args) {

        StudentReturn student = createStudent();

        student.display();
    }
}