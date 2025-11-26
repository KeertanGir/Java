package ProduceAndConsume;

class Consumer extends Thread
{
    Company c;

    Consumer(Company c){
        this.c = c;
    }

    public void run(){

        while(true){

            // consume_item
            try {
                this.c.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }

        }
    }
}
