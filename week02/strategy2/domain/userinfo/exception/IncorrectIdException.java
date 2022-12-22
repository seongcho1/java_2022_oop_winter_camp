package week02.strategy2.domain.userinfo.exception;

public class IncorrectIdException extends RuntimeException {
  public IncorrectIdException(String errorMessage) {
    super(errorMessage);
  }
}
