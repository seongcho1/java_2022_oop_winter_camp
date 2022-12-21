public class CarFactoryTest {
    public static void main(String[] args) {
        /*
        CarFactory carFactory = new CarFactory();
        
        Car car1 = carFactory.produceCar(Car.SONATA);
        System.out.println(car1.toString());

        Car car2 = carFactory.produceCar(Car.GENESIS);
        System.out.println(car2);
        
        Car car3 = carFactory.produceCar(Car.GRANDEUR);
        System.out.println(car3);
        */
        
        SingleCarFactory sonataFactory = new SonataFactory();
        Car sonata1 = sonataFactory.getCar();
        System.out.println(sonata1);

        SingleCarFactory genesisFactory = new GenesisFactory();
        Car genesis1 = genesisFactory.getCar();
        System.out.println(genesis1);

        SingleCarFactory grandeurFactory = new GrandeurFactory();
        Car grandeur1 = grandeurFactory.getCar();
        System.out.println(grandeur1);
        
    }  
}