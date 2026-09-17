class DisplayOverloading {

    void display(int number) {
        System.out.println("Integer : " + number);
    }

    void display(double number) {
        System.out.println("Double : " + number);
    }

    void display(String text) {
        System.out.println("String : " + text);
    }

    public static void main(String[] args) {

        DisplayOverloading obj = new DisplayOverloading();

        obj.display(10);
        obj.display(25.6);
        obj.display("Java");
    }
}