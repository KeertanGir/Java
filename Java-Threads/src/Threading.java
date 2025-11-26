
class Threading implements Runnable{

    public void run(){

        for (int i = 1; i<=10 ; i++ ) {
            System.out.println("The number is "+ i);

//           Throws The Exception
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }


    }

    public static void main(String [] args){

        Threading t1 = new Threading();

        Thread thr = new Thread(t1);


        ThreadByThread t2 = new ThreadByThread();

        thr.start();
        t2.start();
    }

}