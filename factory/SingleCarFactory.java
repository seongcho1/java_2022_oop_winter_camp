public abstract class SingleCarFactory {
    
    //operation()
    public Car getCar() {
        //product = factoryMethod();
        Car car = produceCar();
        
        //checkCar
        //deliverCar
        return car;
    }
    
    //factoryMethod()
    public abstract Car produceCar();
}