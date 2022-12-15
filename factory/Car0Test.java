public class Car0Test {
    public static void main(String[] args) {
        Car0Test test = new Car0Test();
        Car0 car = test.produceCar("Sonata");
        System.out.println(car);
    }
    public Car0 produceCar(String name) {
        Car0 car = null;
        if( name.equalsIgnoreCase(Car0.SONATA)) {
        car = new Car0(Car0.SONATA);
        }
        else if( name.equalsIgnoreCase(Car0.GRANDEUR)) {
        car = new Car0(Car0.GRANDEUR);
        }
        else if( name.equalsIgnoreCase(Car0.GENESIS)) {
        car = new Car0(Car0.GENESIS);
        }
        else {
        car = new Car0("noname");
        }
        return car;
    }
}