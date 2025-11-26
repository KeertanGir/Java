package TrafficLight;

class TrafficLight{
    boolean f = false;
    // false : Red : Stop
    // true : yellow then Green : ready and Go

    synchronized public void Red(){
        // if(f){
        // 	try{
        // 		wait();
        //  	}catch(Exception e){}
        // }

        while(f){
            try{
                wait();
            }catch(Exception e){}
        }


        System.out.println("Red : Stop");
        f = true;
        notify();
    }

    synchronized public void go(){
        // if(!f){  // Wait K sath If Use nhi krty While Krty hain
        // 	try{
        // 		wait();
        // 	}catch(Exception e){}
        // }

        while(!f){
            try{
                wait();
            }catch(Exception e){}
        }

        System.out.println("Yellow : Ready");
        try {
            Thread.sleep(1000);
        } catch(Exception e){}


        // Green
        System.out.println("Green : Go");
        try {
            Thread.sleep(9000);
        } catch(Exception e){}

        // System.out.println("Green : Go");
        f = false;
        notify();
    }
}