class GarbageCollection {

    GarbageCollection() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {

        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        GarbageCollection obj3 = new GarbageCollection();

        obj1 = null;
        obj2 = null;
        obj3 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}