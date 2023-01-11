package mediator;

import java.awt.Button;

public class ColleagueTextField extends Button implements Colleague {
  private Mediator mediator;

  public ColleagueTextField(String caption) {
      super(caption);
  }
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
      setEnabled(enabled);
  }
}
