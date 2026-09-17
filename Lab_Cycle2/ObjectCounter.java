class ObjectCounter {

    static int count = 0;

    ObjectCounter() {
        count++;
    }

    public static void main(String[] args) {

        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println("Objects Created : " + count);
    }
}