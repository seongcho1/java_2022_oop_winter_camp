import Franchise.INonameBeans;
import java.io.ByteArrayOutputStream;

public class Debug {
    final public void PrintString(final INonameBeans product) {
        try {
            var result = new ByteArrayOutputStream();
            var buffer = product.OrderMenu().readAllBytes();

            result.write(buffer);
            System.out.println(result);
        }
        catch (Exception e) { System.out.println(" -- Exception in PrintString: " + e + " -- "); }
    }
}
