public class CarFactory implements ICarFactory {
    @Override
    public Car produceCar(String carType) {
        switch(carType) {
            case Car.SONATA: return new Sonata();
            case Car.GRANDEUR: return new Grandeur();
            case Car.GENESIS: return new Genesis();
        }
        
        return null;
    }
}