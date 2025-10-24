public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 1999, false);
        Car car2 = new Car("Tesla", 2020, true);
        car1.displayInfo();
        car2.displayInfo();
    }
}