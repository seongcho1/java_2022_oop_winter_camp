package car;

public class ManualCar extends Car {

  @Override
  public void drive() {
    System.out.println("사람이 운전합니다.");
    System.out.println("사람이 핸들을 조작합니다.");
  }

  @Override
  public void stop() {
    System.out.println("브레이크를 밟아서 정지합니다.");
  }

  @Override
  public void startUpdate() {
    System.out.println("차가 OS를 가지고 있고 자기 자신을 업데이트 한다고? 말도 안되는 소리!");
  }
}
