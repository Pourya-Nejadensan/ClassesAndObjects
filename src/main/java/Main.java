public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.starts());
        car.accelerates();
        System.out.println(car.Speed);
        car.accelerates();
        System.out.println(car.Speed);
    }
}
