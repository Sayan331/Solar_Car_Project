public class Car {
    protected double batteryLevel;
    protected final double fullBattery = 100;
    public Car(){
        batteryLevel = fullBattery;
    }
    public void forward(double distance){
        System.out.println("Go forward for " + distance + " metres");
        batteryLevel -= distance/10; //1 unit of distance uses 0.1 unit of battery
    }
    public void backwards(double distance) {
        System.out.println("Go backwards for " + distance + " metres");
        batteryLevel -= distance / 10; //1 unit of distance uses 0.1 unit of battery
    }
    public void turn(DirectionOfCar dir, double angle){
        System.out.println("Turn " + dir + " by " + angle + " degrees ");
        batteryLevel -= angle/900; //1 left or right turn, i.e., 90 degrees of turn reduces battery 0.1 unit
    }
    public double getBattery(){
        return batteryLevel;
    }
    public void chargeBattery1(){
        System.out.println("Charge battery from socket");
        batteryLevel = fullBattery;
    }


}
