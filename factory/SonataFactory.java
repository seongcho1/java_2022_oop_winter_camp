public class SonataFactory extends SingleCarFactory {
    @Override
    public Car produceCar() {
        return new Sonata();
    }
}