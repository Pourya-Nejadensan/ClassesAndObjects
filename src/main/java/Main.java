public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.starts());
        car.accelerates();
        System.out.println("first car: " + car.Speed);
        car.accelerates();
        System.out.println("first car: " + car.Speed);

        Car secondCar = new Car();
        for (int i=0 ; i<10 ; i++){
            secondCar.accelerates();
        }
        System.out.println("second car: " + secondCar.Speed);
    }
}
