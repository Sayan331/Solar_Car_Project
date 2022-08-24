

public class Main {
    public static void main(String[] args) {
        SolarCar myCar = new SolarCar();
        System.out.println(myCar.getBattery());
        myCar.forward(900);
        System.out.println(myCar.getBattery());

    }
}