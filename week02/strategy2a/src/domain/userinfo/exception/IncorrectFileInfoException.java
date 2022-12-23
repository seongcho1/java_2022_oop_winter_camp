package domain.userinfo.exception;

public class IncorrectFileInfoException extends RuntimeException {
  public IncorrectFileInfoException(String errorMessage) {
    super(errorMessage);
  }
}
