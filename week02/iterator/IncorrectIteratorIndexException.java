package week02.iterator;

public class IncorrectIteratorIndexException extends RuntimeException{
  public IncorrectIteratorIndexException(String errorMessage) {
      super(errorMessage);
  }
}
