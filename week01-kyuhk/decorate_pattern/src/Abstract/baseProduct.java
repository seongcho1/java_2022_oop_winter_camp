package Abstract;

import Franchise.INonameBeans;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;

public abstract class baseProduct implements INonameBeans {
    protected InputStream foundation;
    protected baseProduct(String product) { this.foundation = new ByteArrayInputStream(product.getBytes()); }

    final public boolean HaveAnnotationType(Annotation other) {
        return (this.getClass().getAnnotation(other.annotationType()) != null);
    }

    final public InputStream OrderMenu() { return foundation; }
}
