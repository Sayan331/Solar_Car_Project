public class SolarCar extends Car implements SolarPanel{
    //method overriding
    public void chargeBattery(){
        System.out.println("Charge battery with " + numPanels + " solar panels");
        this.batteryLevel = fullBattery;
    }
    public void moveWithSolarEnergy(double distance){
        System.out.println("Move for " + distance + " metres " + "without using battery");
    }
    public void turnWithSolarEnergy(double angle){
        System.out.println("Turn for " + angle + " degrees " + "without using battery");
    }
}
