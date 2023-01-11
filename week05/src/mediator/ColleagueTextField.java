package mediator;

import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
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
  @Override
  public void textValueChanged(TextEvent e) {
    System.out.println("" + e);
    //System.exit(0);
    mediator.colleagueChanged(this);

  }
}
