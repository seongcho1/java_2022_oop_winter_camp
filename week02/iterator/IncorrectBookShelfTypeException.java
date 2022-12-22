package week02.iterator;

public class IncorrectBookShelfTypeException extends RuntimeException{
  public IncorrectBookShelfTypeException(String errorMessage) {
      super(errorMessage);
  }
}
