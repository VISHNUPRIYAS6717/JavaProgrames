class FinalizeDemo {

    FinalizeDemo() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {

        FinalizeDemo obj = new FinalizeDemo();

        obj = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}