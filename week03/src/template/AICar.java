package template;

public class AICar extends Car {

  @Override
  public void drive() {
    System.out.println("자율 주행합니다.");
    System.out.println("자동차가 스스로 방향을 바꿉니다.");
  }

  @Override
  public void stop() {
    System.out.println("스스로 멈춥니다.");
  }

  //subclass never calls a high-level component directly
  @Override
  public boolean isAutoUpdateMode() {
    return true;
  }

  @Override
  public void startUpdate() {
    System.out.println("소프트웨어 업데이트를 수행합니다.");
  }

}
