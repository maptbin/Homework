public class Car {
    String brand;
    int year;
    boolean isElectric;

    public Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }
    public void displayInfo(){
        System.out.println("Марка: "+this.brand+", Год: "+this.year+", Электро: "+this.isElectric);
    }
}
