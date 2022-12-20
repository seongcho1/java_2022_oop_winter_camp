public class GrandeurFactory extends SingleCarFactory {
    @Override
    public Car produceCar() {
        return new Genesis();
    }
}
