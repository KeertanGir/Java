package TrafficLight;

class go extends Thread{

    TrafficLight tl;

    public go(TrafficLight tl){
        this.tl = tl;
    }

    public void run(){
        while(true){


            this.tl.go();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){}
        }
    }
}