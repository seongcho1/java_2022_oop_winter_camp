package week02.iterator;

public class IncorrectIteratorTypeException extends RuntimeException{
  public IncorrectIteratorTypeException(String errorMessage) {
      super(errorMessage);
  }
}
