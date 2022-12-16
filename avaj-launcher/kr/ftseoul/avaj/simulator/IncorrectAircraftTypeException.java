package kr.ftseoul.avaj.simulator;

public class IncorrectAircraftTypeException extends RuntimeException {
  public IncorrectAircraftTypeException(String errorMessage) {
      super(errorMessage);
  }
}
