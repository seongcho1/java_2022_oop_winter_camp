package week02.strategy2.userinfo.web;

public class IncorrectFileInfoException extends RuntimeException {
  public IncorrectFileInfoException(String errorMessage) {
    super(errorMessage);
  }
}
