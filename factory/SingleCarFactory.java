public abstract class SingleCarFactory {

    //operation()
    public final Car getCar() {
        //orderCar

        //product = factoryMethod();
        Car car = produceCar();

        //checkCar
        //deliverCar
        return car;
    }

    //factoryMethod()
    protected abstract Car produceCar();
}
