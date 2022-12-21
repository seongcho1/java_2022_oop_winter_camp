import Factory.CarFactory;

public class CarTest {
    public static void main(String[] args) {

        final var factory = new CarFactory();

        try {
            final var porsche = factory.Order("pOrScHe");
            System.out.println(porsche);
            System.out.println(porsche.toUpper());
        }
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(factory.Order("sonATA")); }
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(factory.Order("GENEsis"));}
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(factory.Order("grandeur")); }
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(factory.Order("e")); }
        catch (Exception e) { System.out.println(e); }

        try { System.out.println(factory.Order("")); }
        catch (Exception e) { System.out.println(e); }

    }
}
