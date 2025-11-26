class UserThread extends Thread{
    @Override
    public void run(){
        System.out.println("This is User Thread");
    }
}

class ThreadsOP {
    public static void main(String [] args){

        System.out.println("Program Start...");

        Thread ct =  Thread.currentThread();
        System.out.println("Current Thread Name Is : "+ ct.getName());

        // Set and get Name
        ct.setName("My Main");
        System.out.println("Name changed : "+ ct.getName());
        // sleep

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }


        // thread Id
        System.out.println(ct.threadId());

        System.out.println("Program Terminated...");

        UserThread ut = new UserThread();
        ut.start();

    }
}