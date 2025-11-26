package ProduceAndConsume;

class Company{


    int i;
    boolean f = false;
    // f = false : Chance : Procuder
    // f = true : Chance : consumer
    synchronized public void produce_item(int n){
        if(f){
            try{
                wait();
            }catch(Exception e){}
        }

        this.i = n;
        System.out.println("Produced : "+ this.i);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if(!f){
            wait();
        }
        System.out.println("Consumed : "+ this.i);
        f = false;
        notify();
        return this.i;
    }

}