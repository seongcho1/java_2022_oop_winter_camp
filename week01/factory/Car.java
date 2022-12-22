//https://niceman.tistory.com/143
//https://brownbears.tistory.com/577
//https://stackoverflow.com/questions/5739611/what-are-the-differences-between-abstract-factory-and-factory-design-patterns
//https://bcp0109.tistory.com/367
//https://soojong.tistory.com/entry/Design-Pattern-팩토리-패턴Factory-Pattern

public abstract class Car {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    String productName;
    
    public String toString() {
        return productName;
    }
}