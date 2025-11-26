package TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight traffic = new TrafficLight();
        Red r = new Red(traffic);
        go g = new go(traffic);

        r.start();
        g.start();
    }

}
