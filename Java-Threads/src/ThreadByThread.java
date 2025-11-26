class ThreadByThread extends Thread{


    public void run(){
        for(int i = 1; i<=10; i++){

            System.out.println("Another Thread : "+ i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }

        }
    }

}