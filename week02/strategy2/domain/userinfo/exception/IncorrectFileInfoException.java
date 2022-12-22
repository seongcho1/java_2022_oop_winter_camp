package week02.strategy2.domain.userinfo.exception;

public class IncorrectFileInfoException extends RuntimeException {
  public IncorrectFileInfoException(String errorMessage) {
    super(errorMessage);
  }
}
