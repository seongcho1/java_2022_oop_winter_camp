package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class ColleagueCheckbox extends Checkbox implements Colleague {
  private Mediator mediator;

  public ColleagueCheckbox(String caption, CheckboxGroup checkboxGroup, Boolean flag) {
      super(caption);
      this.setCheckboxGroup(checkboxGroup);

  }
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
      setEnabled(enabled);
  }
}
