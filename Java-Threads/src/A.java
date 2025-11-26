class A extends Thread{
    A(String name){
        super(name);
        start();
    }

    public void run(){


        try{

            for (int i =0; i<=9 ; i++ ) {
                System.out.println( getName() +" = "+ (i+1));
                Thread.sleep(1000);
            }

        }catch(Exception e){}

        System.out.println(getName() + " Finished ");
    }
}
