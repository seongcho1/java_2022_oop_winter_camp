public class GenesisFactory extends SingleCarFactory {
    @Override
    public Car produceCar() {
        return new Genesis();
    }
}