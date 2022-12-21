package Franchise;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

public interface INonameBeans {
    InputStream OrderMenu() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException;
    boolean HaveAnnotationType(Annotation other);
}
