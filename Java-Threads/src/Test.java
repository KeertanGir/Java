class Test {
    public static void main(String [] args) throws Exception {

        A t1 = new A("One Thread");
        A t2 = new A("Two Thread");
        A t3 = new A("Three Thread");


        boolean b1 = t1.isAlive();
        boolean b2 = t2.isAlive();
        boolean b3 = t3.isAlive();


        System.out.println(t1.getName() + " = " + b1);
        System.out.println(t2.getName() + " = " + b3);
        System.out.println(t3.getName() + " = " + b2);

        t1.join();
        t2.join();
        t3.join();

        System.out.println(t1.getName() + " = " + t1.isAlive());
        System.out.println(t1.getName() + " = " + t2.isAlive());
        System.out.println(t1.getName() + " = " + t3.isAlive());
    }
}