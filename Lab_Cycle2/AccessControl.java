class AccessControl {

    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        AccessControl s = new AccessControl();

        s.setName("Maya");
        s.setAge(19);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}