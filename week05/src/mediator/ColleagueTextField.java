package mediator;

import java.awt.TextField;

public class ColleagueTextField extends TextField implements Colleague {
  private Mediator mediator;

  public ColleagueTextField(String caption, int size) {
      super(caption, size);
  }
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
      setEnabled(enabled);
  }
}
