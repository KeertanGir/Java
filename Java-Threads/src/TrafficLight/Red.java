package TrafficLight;

class Red extends Thread{

    TrafficLight tl;
    public Red(TrafficLight tl){
        this.tl = tl;
    }

    public void run(){

        while(true){
            this.tl.Red();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }
}