package Abstract;

import Franchise.INonameBeans;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class topping implements INonameBeans {
    final protected INonameBeans foundation;
    protected InputStream material;
    protected topping(INonameBeans foundation) { this.foundation = foundation; }

    final public boolean HaveAnnotationType(Annotation other) {
        return (this.getClass().getAnnotation(other.annotationType()) != null);
    }

    final public InputStream OrderMenu() throws AnnotationTypeMismatchException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        var array = this.getClass().getAnnotations();

        if (0 < array.length) {
            for (var item : array) {
                if (foundation.HaveAnnotationType(item)) { return new SequenceInputStream(foundation.OrderMenu(), this.material); }
            }
        }

        var types = Arrays.stream(array).map(e -> e.annotationType().getName());
        throw new AnnotationTypeMismatchException(null, types.collect(Collectors.joining()));
    }
}
